import java.util.ArrayList;

public class ReverseSen_Arraylist {
	public static void main(String[] args) {
		String str="We will succed one day";
		ArrayList<String> str1=new ArrayList();
		String s="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{
				str1.add(s);
				s="";
			}
		}
		str1.add(s);
		
		for(int i=str1.size()-1; i>=0; i--)
		{
			String str2=str1.get(i);
			
			System.out.print(str2+" ");
		}
		System.out.println();
		
		for(int i=str1.size()-1; i>=0; i--)
		{
			String str2=str1.get(i);
			int c=0;
			for(int j=0; j<str2.length(); j++)
			{
				c+=str2.charAt(j);
			}
			System.out.print(str2+c+" ");
		}
		System.out.println();
	}
}
