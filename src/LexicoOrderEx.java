import java.util.Scanner;

public class LexicoOrderEx {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();	    
	        
	        System.out.println(getSmallestAndLargest(s, k));
	        scan.close();
	    }

	private static String getSmallestAndLargest(String s, int k) {
		
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		
		for (int i = 1; i < s.length() - (k-1); i++) {
			
			String temp = s.substring(i, k + i);
			
			if (smallest.compareTo(temp) > 0) {
				smallest = temp;
			} 
			
			if (largest.compareTo(temp) < 0) {
				largest = temp;
			}
			
		}
		
		return smallest + "\n" + largest;
	}
}
