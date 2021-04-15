
public class RevStr {
	public static void main(String[] args) {
		String str = "Subhrajit";
//		StringBuilder sb=new StringBuilder(str);
//		sb.reverse();
//		System.out.println(sb);
		
		String s= "";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			s=s+ch[i];
		}
		System.out.println(s);
	}
}
