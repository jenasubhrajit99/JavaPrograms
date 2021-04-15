import java.awt.*;
public class ExampleFram extends Frame
{
	void createUI()
	{
		setBackground(Color.red);
		setResizable(true);
		setLocation(300,300);
		setSize(200,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		ExampleFram E =new ExampleFram();
		E.createUI();
		Frame f1=new Frame();
		f1.setVisible(true);
		f1.setSize(300,300);
	}
}
