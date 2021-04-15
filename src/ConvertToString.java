public class ConvertToString 
{
	static String s="";
	int i;
	String charTostring(char[] arr, int size)
	{
		
		for(i = 0; i < size; i++)
		{
			
			s = s + arr[i];
		}
		return s;
	}
	public static void main(String[] args) 
	{
		
		char[] arr = {'s','u','b','h','r','a','j','i','t'};
		int size = arr.length;
		System.out.println(size);
		ConvertToString cos = new ConvertToString();
		cos.charTostring(arr, size);
		System.out.println(s);
	}
}