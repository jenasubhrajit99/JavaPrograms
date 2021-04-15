import java.math.BigDecimal;
import java.util.*;
public class BigDecimal_Ex{
    public static void main(String []args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        
        for(int i = 0; i<s.length; i++)
        {
        	BigDecimal bd = new BigDecimal(s[i]);
        	int in = i;
            for(int j = i+1; j<s.length; j++)
            {            	
            	BigDecimal bd1 = new BigDecimal(s[j]);
                if(bd1.compareTo(bd)==1)
                {
                	bd=bd1;
                	in = j;
                }
            }
            String temp=s[i];
            s[i]=s[in];
            s[in]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}