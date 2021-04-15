import java.util.*;
public class CheckAnagram 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		boolean result = isAnagram(a, b);
		System.out.println((result) ? "Anagram" : "Not Anagram");
	}

	private static boolean isAnagram(String a, String b) {
		String A=a.toLowerCase();
		String B=b.toLowerCase();
		
		char[] c=A.toCharArray();
		Arrays.sort(c);
		char[] d=B.toCharArray();
		Arrays.sort(d);
		
		String a1=new String(c);
		String b1=new String(d);
		
		if(a1.equals(b1))
		{
			return true;
		}
		
		return false;
	}
}
