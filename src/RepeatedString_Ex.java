import java.io.*;
import java.util.*;

public class RepeatedString_Ex {
    static long repeatedString(String s, long n) {
    	long size=s.length();
    	long rep=n/size;
    	long extraChar=n-(rep*size);
    	long count=0;
    	long count1=0;
    	for(int i=0; i<size; i++)
    	{
    		if(s.charAt(i)=='a')
    			count++;
        }
    	for(int j=0; j<extraChar; j++)
    	{
    		if(s.charAt(j)=='a')
    			count1++;
    	}
    	long a=(rep*count)+count1;
    	return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("Enter the String");
        String s = scanner.nextLine();
        System.out.println("Enter the Repeat Size");
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println("The a's in the repeated string is : "+result);


        scanner.close();
    }
}
