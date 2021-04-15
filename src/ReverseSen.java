public class ReverseSen {
	public static void main(String[] args) {
		String str = "we will succeed one day";
//		String[] str1 = str.split(" ");
//		int asci=0;
//		
//		for(int i = str1.length-1; i>=0; i--)
//		{
//			System.out.print(str1[i]+" ");
//		}
//		System.out.println();
//		for(int i = str1.length-1; i>=0; i--)
//		{
//			char[] ch= str1[i].toCharArray();
//			for(char c : ch)
//			{
//				asci=asci+c;
//			}
//			System.out.print(str1[i]+asci+" ");
//			asci=0;
//		}
		int asci=0;
		String[] str1 = new String[5];
		int i=0;
		String temp="";
		for(int j = 0; j<str.length(); j++)
		{
			if(str.charAt(j)!=' ')
			{
				temp=temp+str.charAt(j);
			}
			else
			{
				
				str1[i]=temp;
				temp="";
				i++;
			}
		}
		str1[i]=temp;
		
		for(int k = str1.length-1; k>=0; k--)
			{
				char[] ch= str1[k].toCharArray();
				for(char c : ch)
				{
					asci=asci+c;
				}
				System.out.print(str1[k]+asci+" ");
				asci=0;
			}
	}
}
