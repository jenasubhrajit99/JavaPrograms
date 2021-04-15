public class Pattern_Print {
	public static void main(String[] args) {
		new Pattern_Print().pattern();
	}

	
//	private void pattern() {
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=0; j<6-i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int s=1; s<=i*2-1; s++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=4; i>=0; i--)
//		{
//			for(int j=0; j<=5-i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int s=1; s<=i*2-1; s++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
	
	
private void pattern() {
		int i=0;
		while(i<=5)
		{
			int j=0;
			while(j<6-i)
			{
				System.out.print(" ");
				j++;
			}
			int s=1;
			while(s<=i*2-1)
			{
				System.out.print("*");
				s++;
			}
			System.out.println();
			i++;
		}
		int i1=4;
		while(i1>=0)
		{
			int j=0;
			while(j<=5-i1)
			{
				System.out.print(" ");
				j++;
			}
			int s=1;
			while(s<=i1*2-1)
			{
				System.out.print("*");
				s++;
			}
			System.out.println();
			i1--;
		}
		
	}

}



