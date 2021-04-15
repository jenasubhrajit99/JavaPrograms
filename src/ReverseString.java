public class ReverseString {
	public static void main(String[] args) {
		String str = "we will succed one day";
		String[] str1 = str.split(" ");
		int ascii = 0;
		String temp="";
		int i = str1.length-1;
		while(i>=0)
		{
			System.out.print(str1[i]+" ");
			i--;
		}
		
//		for(int i = str1.length-1; i>=0; i--)
//		{
//			System.out.print(str1[i]+" ");
//		}
		System.out.println();
		for(int i1 = str1.length-1; i1>=0; i1--)
		{
			char[] ch = str1[i1].toCharArray();
			for(char c : ch)
			{
				ascii+=c;
			}
			System.out.print(str1[i1]+ascii+" ");
			ascii = 0;
		}
	}
}
