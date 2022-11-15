import java.util.Scanner;

public class CountCharacters 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String consonants="bcdfghjklmnpqrstvwxyz";
		String vowels="aeiou";
		String specials="~!@#$%^&*[].,;,<>-=''/()_+{}:\"<>?|??\\";
		int consonantsCount=0;
		int vowelsCount=0;
		int specialsCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(consonants.contains(String.valueOf(s.charAt(i))))
			{
				consonantsCount++;
			}
			else if(vowels.contains(String.valueOf(s.charAt(i))))
			{
				vowelsCount++;
			}
			else if(specials.contains(String.valueOf(s.charAt(i))))
			{
				specialsCount++;
			}
		}
		System.out.println("consonantsCount is "+consonantsCount);
		System.out.println("vowelsCount is "+vowelsCount);
		System.out.println("specialsCount is "+specialsCount);
	}

}
