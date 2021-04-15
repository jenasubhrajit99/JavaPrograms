import java.util.*;

//Count Sub-Strings that contains all vowels

public class CountSubstringVowels 
{
	static boolean isVowel(char c) 
	{
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
	private static int countSubstringutil(char[] s) 
	{
		int count = 0;
		Map<Character, Integer> mp = new HashMap<>();
		int n = s.length;
		int start = 0;
		for(int i = 0; i<n; i++)
		{
			if(mp.containsKey(s[i]))
			{
				mp.put(s[i], mp.get(s[i])+1);
			}
			else
			{
				mp.put(s[i], 1);
			}
			while(mp.containsKey('a') && mp.containsKey('e') &&
					mp.containsKey('i') && mp.containsKey('o') &&
					mp.containsKey('u') && mp.get('a')>0 && mp.get('e')>0 &&
					mp.get('i')>0 && mp.get('o')>0 && mp.get('u')>0)
			{
				count = count+n-i;
				mp.put(s[start], mp.get(s[start])-1);
				start++;
			}
		}
		return count;
	}
	private static int countSubstrings(String s) 
	{
		int count = 0;
		String temp = "";
		for(int i=0; i<s.length(); i++)
		{
			if(isVowel(s.charAt(i)))
			{
				temp = temp+s.charAt(i);
			}
			else
			{
				if(temp.length()>0)
				{
					count = count + countSubstringutil(temp.toCharArray());
				}
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		String s = "aeouisddaaeeiouua";
		System.out.println(countSubstrings(s));
	}
}
