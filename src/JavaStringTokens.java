import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        scan.close();
        
        String[] tokens = input.split("[^\\p{Alpha}]+");
        
        int size = (input.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);
        
        for(String s : tokens) {
            System.out.println(s);
        }
    }
}



/*
 * import java.io.*; import java.util.*;
 * 
 * public class JavaStringTokens {
 * 
 * public static void main(String[] args) { Scanner scan = new
 * Scanner(System.in);
 * 
 * if(!scan.hasNext()) { System.out.println(0); } else { String s =
 * scan.nextLine(); String[] a = s.trim().split("[^\\p{Alpha}]+"); int size =
 * (s.isEmpty()) ? 0 : a.length; System.out.println(size); for(String n : a) {
 * System.out.println(n); }
 * 
 * }
 * 
 * scan.close(); } }
 */

