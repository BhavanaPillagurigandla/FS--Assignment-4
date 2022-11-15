import java.util.Scanner;

public class Panagram 
{
	public static void main(String[] args) 
	{
		String s1="abcdefghijklmnopqrstuvwxyz";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter str= ");
		String s2=sc.nextLine().toLowerCase();
		int length=0;
		if(s1.length()>=26)
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
				System.out.println(s2+" is panagram");
			}
			else
			{
				System.out.println(s2+" is not panagram");
			}
		}
		else
		{
			System.out.println(s2+" Not panagram");
		}
	}

}
