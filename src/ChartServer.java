import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class ChartServer extends JFrame implements ActionListener,Runnable
{
	JTextField tf1;
	JButton b1;
	JTextArea ta1;
	JScrollPane p1;
	
	ServerSocket ss;
	Socket s1;
	PrintWriter pw;
	BufferedReader br;
	
	public ChartServer()
	{
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		setTitle("Chart Server..");
		
		tf1 = new JTextField();
		ta1 = new JTextArea();
		p1 = new JScrollPane(ta1);
		b1 = new JButton("Send");
		
		add(tf1);
		add(b1);
		add(p1);
		
		tf1.setBounds(30, 30, 150, 30);
		b1.setBounds(190, 30, 80, 30);
		p1.setBounds(30, 70, 240, 250);
		
		setVisible(true);
		setSize(330, 400);
		try
		{
			ss = new ServerSocket(4000);
			s1 = ss.accept();
			pw = new PrintWriter (s1.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
		}
		catch (Exception e) 
		{
			
		}
		tf1.addActionListener(this);
		b1.addActionListener(this);
		new Thread(this).start();
	}
	
	public void run() 
	{
		while(true)
		{
			try 
			{
				Calendar calender = Calendar.getInstance();
				int d = calender.get(calender.DATE);
				int m = calender.get(calender.MONTH);
				int y = calender.get(calender.YEAR);
				int hh = calender.get(calender.HOUR);
				int mm = calender.get(calender.MINUTE);
				int ss = calender.get(calender.SECOND);
				String time = d+"/"+m+"/"+y+" "+hh+":"+mm+":"+ss+"\n";
				String text = br.readLine();
				ta1.append(text+"\t-Sender"+time);
			}
			catch (Exception e) 
			{
				
			}
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		Calendar calender = Calendar.getInstance();
		int d = calender.get(calender.DATE);
		int m = calender.get(calender.MONTH);
		int y = calender.get(calender.YEAR);
		int hh = calender.get(calender.HOUR);
		int mm = calender.get(calender.MINUTE);
		int ss = calender.get(calender.SECOND);
		String time = d+"/"+m+"/"+y+" "+hh+":"+mm+":"+ss+"\n";
		String text = tf1.getText();
		tf1.setText("");
		ta1.append(text+"\t-Me "+time);
		pw.println(text);
	}
	public static void main(String[] args) 
	{
		new ChartServer();
	}
}
