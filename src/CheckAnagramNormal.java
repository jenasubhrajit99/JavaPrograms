import java.util.Scanner;

public class CheckAnagramNormal {

    static boolean isAnagram(String a, String b) {
        String A=a.toLowerCase();
        String B=b.toLowerCase();
        
        char[] c=A.toCharArray();
        char temp = 0;
        int count = 0;
        for(int i : c)
        {
            count++;
        }
        int length=count;
        for(int i=0; i<length; i++)
        {
            for(int j=i+1; j<length; j++)
            {
                if(c[i]>c[j])
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
       
        int count1 = 0;
        char[] d=B.toCharArray();
         for(int j : d)
        {
            count1++;
        }
        int length1=count1;
        for(int i=0; i<length1; i++)
        {
            for(int j=i+1; j<length1; j++)
            {
                if(d[i]>d[j])
                {
                    temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        
        
        String a1=new String(c);
        String b1=new String(d);
        
        if(a1.equals(b1))
        {
            return true;
        }
        
        return false;
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
