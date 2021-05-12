import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.io.IOException;
import java.lang.reflect.Method;

public class Test{
	public static void main(String[] args) {
		
	}
}



//class Animal {
//    public static void testClassMethod() {
//        System.out.println("The static method in Animal");
//    }
//    public void testInstanceMethod() {
//        System.out.println("The instance method in Animal");
//    }
//}
//
//public class Test extends Animal {
//    public static void testClassMethod() {
//        System.out.println("The static method in Cat");
//    }
//    public void testInstanceMethod() {
//        System.out.println("The instance method in Cat");
//    }
//
//    public static void main(String[] args) {
//        Test myCat = new Test();
//        Animal myAnimal = myCat;
//        Animal.testClassMethod();
//        myAnimal.testInstanceMethod();
//    }
//}



//class Printer
//{
//	public <inputType> void printArray(inputType[] array) {
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}	
//}
//
//public class Test{  
//	public static void main(String[] args) {
//		 Printer myPrinter = new Printer();
//	        Integer[] intArray = { 1, 2, 3 };
//	        String[] stringArray = {"Hello", "World"};
//	        myPrinter.printArray(intArray);
//	        myPrinter.printArray(stringArray);
//	        int count = 0;
//
//	        for (Method method : Printer.class.getDeclaredMethods()) {
//	            String name = method.getName();
//
//	            if(name.equals("printArray"))
//	                count++;
//	        }
//
//	        if(count > 1)System.out.println("Method overloading is not allowed!");
//	      
//	}	
//}
		
		
		
//		String s = "abcac";
//		long n = 9;
//		long size=s.length();
//    	long rep=n/size;
//    	long extraChar=n-(rep*size);
//    	long count=0;
//    	long count1=0;
//    	for(int i=0; i<size; i++)
//    	{
//    		if(s.charAt(i)=='a')
//    			count++;
//        }
//    	System.out.println(count);
//    	for(int j=0; j<extraChar; j++)
//    	{
//    		if(s.charAt(j)=='a')
//    			count1++;
//    	}
//    	System.out.println(count1);
//    	long a=(rep*count)+count1;
//		System.out.println(a);
		
		
//		String s = "a";
//		int a = s.length();
//		int count=0;
//		long n = 9;
//		ArrayList<String> arr = new ArrayList<String>();
//		int j = 0;
//		for(int i = 0; i<n; i++)
//		{
//			if(a==j)
//				j=0;
//			arr.add(s);
//			for(String s1 : arr)
//			{
//				if(s1=="a")
//	    			count++;
//			}
//			
//		}
//		System.out.print(arr);
//		System.out.println();
//		System.out.println(count);
		
		
//		String s = "abcac";
//		BigInteger n = BigInteger.valueOf(100000000000000l);
//    	int a = s.length();
//        if(a==1)
//        {
//            System.out.println(n);
//        }
//        else
//        {
//            long count=0;
//             
//            ArrayList<Character> list=new ArrayList<Character>();
//            int j = 0;
//            for(long i = 0; i<n; i++)
//            {
//                if(a==j)
//                    j=0;
//                list.add(s.charAt(j++));
//               
//            }
//            for(int i=0;i<list.size();i++)
//            {
//            	 if(list.get(i)=='a')
//            		 count++;
//            }
//            System.out.println(list);
//            System.out.println(count);
//        }
		
//		List<String> s1 = new ArrayList<String>();
//		List<Integer> a1 = new ArrayList<Integer>();
//		s1.add("Test1");
//		s1.add("Test2");
//		s1.add("Test3");
//		System.out.println("Initial String of ArrayList : "+s1);
//		s1.remove("Test2");
//		System.out.println("Modified is:"+s1);
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add(1);
//		a1.add(2);
//		System.out.println("Initial Integer ArrayList :"+a1);
//		a1.remove(1);
//		a1.remove(2);
//		System.out.println("modified list :"+a1);
	
//		long a = s.length();
//    	long b = n/a;
//    	String s1 = "";
//    	int count=0;
//    	for(int i = 0; i<b; i++)
//    	{
//    		s1 = s1+s;
//    	}   
//    	System.out.println(s1);
    	
    	
		
		
		
		
//		String s = "abcac";
//		int n = 10;
//		long a = s.length();
//    	long b = n/a;
//    	String s1 = "";
//    	int count=0;
//    	for(int i = 0; i<b; i++)
//    	{
//    		s1 = s1+s;
//    	}   
//    	System.out.println(s1);
//    	char[] a1 = s1.toCharArray();
//    	for(int i =0; i<a1.length; i++)
//    	{
//    		if(a1[i]=='a')
//    			count++;
//    	}
//		System.out.println(count);



//class Test
//{
//	public static void main(String[] args) {
//		int i = 100;
//		print(i);
//    }
//
//	private static void print(int n) {
//		if(n==0)
//			return ;
//		print(n-1);
//		System.out.println(n);
//	}
//}

//class Test {
//	public static void main(String args[])
//    {	
//
//        Hashtable<Integer, String> ht1 = new Hashtable<>(4);
//
//        Hashtable<Integer, String> ht2
//            = new Hashtable<Integer, String>(2);
//  
//        ht1.put(1, "one");
//        ht1.put(2, "two");
//        ht1.put(3, "three");
//        ht1.put(4, "four");
//  
//        ht2.put(4, "four");
//        ht2.put(5, "five");
//        ht2.put(6, "six");
//        ht2.put(7, "seven");
//  
//        
//        System.out.println("Mappings of ht1 : " + ht1);
//        System.out.println("Mappings of ht2 : " + ht2);
//    }
//}

//public class Test{
//	public static void main(String[] args) {
//		int x=10, y=23, z=1; 
//		if((x>y && x>z) || y<z)
//			System.out.println("Z is Big"); 
//		else if((x<z || y>z) && x<y)
//			System.out.println("Y is Big");
//		else
//			System.out.println("X is Big");
//	} 
//}

//import java.util.Comparator;
//import java.util.TreeSet;
//
//class Student implements Comparable{
//	String name;
//	int id;
//	public Student(String name, int id) {
//		this.name=name;
//		this.id=id;
//	}
//	public String toString() {
//		return name+"---"+id;
//	}
//	public int compareTo(Object o) {
//		int id1 = this.id;
//		Student s = (Student) o;
//		int id2 = s.id;
//		if(id1<id2)
//		{
//			return -1;
//		}
//		else if(id1>id2)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
//	}
//	
//}
//class MyComp implements Comparator
//{
//
//	public int compare(Object o1, Object o2) {
//		Student s1 = (Student) o1;
//		Student s2 = (Student) o2;
//		String s = s1.name;
//		String s11 = s2.name;
//		return s.compareTo(s11);
//		
//	}
//	
//}
//public class Test 
//{
//	public static void main(String[] args) {
//		Student s1 = new Student("Subhrajit", 101);
//		Student s2 = new Student("Sachin", 10);
//		Student s3 = new Student("Bhakta", 22);
//		Student s4 = new Student("Bachan", 33);
//		Student s5 = new Student("Sanjay", 1002);
//		
//		TreeSet t = new TreeSet();
//		t.add(s1);
//		t.add(s2);
//		t.add(s3);
//		t.add(s4);
//		t.add(s5);
//		System.out.println(t);
//		System.out.println();
//		
//		TreeSet t1 = new TreeSet(new MyComp());
//		t1.add(s1);
//		t1.add(s2);
//		t1.add(s3);
//		t1.add(s4);
//		t1.add(s5);
//		System.out.println(t1);
//	}
//}


//public class Test {
//	Object message() {
//		return "Hello!";
//	}
//	public static void main(String[] args) {
//		System.out.print(new Test().message());
//		System.out.print(new Test2().message());
//	}
//}
//class Test2 extends Test{
//	String message() {
//		return"World!";
//	}
//}