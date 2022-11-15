import java.util.Scanner;
public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Str1= ");
		String s1=sc.nextLine().toLowerCase().replace(" ", "");
		System.out.print("Enter Str2= ");
		String s2=sc.nextLine().toLowerCase().replace(" ", "");
		int length=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s2.contains(String.valueOf(s1.charAt(i))))
				{
					length++;
				}
			}
			if(length==s1.length())
			{
				System.out.println(s1+" and "+s2+" both are anagram");
			}
			else
			{
				System.out.println(s1+" and "+s2+" both are not anagram");
			}
		}
		else
		{
			System.out.println("Strings are Not anagram");
		}
	}

}
