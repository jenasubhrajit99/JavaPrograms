import java.util.*;
import java.math.BigInteger;

public class BigInteger_Ex {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String numOne=sc.nextLine();
        String numTwo=sc.nextLine();
        sc.close();
       
        
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println(bigNumOne.add(bigNumTwo));
        System.out.println(bigNumOne.multiply(bigNumTwo));
        
    }
} 