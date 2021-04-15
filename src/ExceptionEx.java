import java.io.*;
import java.util.*;

public class ExceptionEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int x=scan.nextInt();
            int y=scan.nextInt();
            int z=x/y;
            System.out.println(z);
            
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}