import java.io.*;
import java.util.zip.DeflaterOutputStream;
public class WriteCompress 
{
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Photo.JPG");
		DeflaterOutputStream dos = new DeflaterOutputStream(new FileOutputStream("b.txt"));
		int ch;
		while((ch=fis.read())!=-1)
		{
			dos.write((byte)ch);
		}
		dos.close();
		fis.close();
		System.out.println("Compressed...........");
	}
}
