import java.io.*;
import java.util.zip.*;
public class UnCompress 
{
	public static void main(String[] args) throws Exception
	{
		InflaterInputStream iis = new InflaterInputStream(new FileInputStream("b.txt"));
		FileOutputStream fos = new FileOutputStream("c.JPG");
		int ch;
		while((ch=iis.read())!=1)
		{
			fos.write(ch);
		}
		fos.close();
		iis.close();
		System.out.println("Un-Compressed............ ");
	}
}