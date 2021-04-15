import java.io.*;
class Teacher implements Serializable
{
	int id;
	String name;
	double salary;
}
public class SerializableReadWrite
{
	public static void main(String[] args) throws Exception 
	{
		Teacher t = new Teacher();
		t.id=1601297130;
		t.name="Subhrajit";
		t.salary=100000;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jeet.txt"));
		oos.writeObject(t);
		System.out.println("Done..................");
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jeet.txt"));
		Teacher t1 =(Teacher)ois.readObject();
		System.out.println("Id : "+t1.id);
		System.out.println("Name : "+t1.name);
		System.out.println("Salary : "+t1.salary);
		ois.close();
	}
}
