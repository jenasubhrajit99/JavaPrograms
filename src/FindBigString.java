public class FindBigString
{
	private static int countString(String str) 
	{
		int res = 0;
		int curr_length=0;
		String s = "";
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				curr_length++;
				s = s+str.charAt(i);
			}
			else
			{
				res=Math.max(res, curr_length);
				curr_length=0;
				s="";
			}
		}
		System.out.println(s);
		return Math.max(res, curr_length);
	}
	public static void main(String[] args) 
	{
		String s = "I am a Student";
		System.out.println(countString(s));
	}
}