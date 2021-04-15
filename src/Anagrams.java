import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String A=a.toLowerCase();
        String B=b.toLowerCase();
        boolean f=false;
        char[] c=A.toCharArray();
        char[] d=B.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String a1=new String(c);
        String b1=new String(d);
        if(a1.equals(b1))
        {
            f=true;
        }
        return f;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
