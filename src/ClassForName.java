class Student
{
	int roll = 100;
	Student()
	{
		System.out.println("Student: Constructor");
	}
}
public class ClassForName
{
	public static void main(String[] args) throws Exception
	{
		Class c=Class.forName("Student");
		Student s=(Student)c.newInstance();
		System.out.println(s.roll);
		System.out.println("Hello");
	}
}
