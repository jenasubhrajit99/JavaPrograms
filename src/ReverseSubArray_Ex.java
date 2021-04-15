import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseSubArray_Ex {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the Elements : ");
		Scanner sc =new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
		for(int i : list)
		{
			if(i%2!=0)
			{
				list2.add(i);
			}
			if(i%2==0)
			{
				list1.add(i);
			}
		}
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(list2);
	}
}