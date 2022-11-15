import java.util.Scanner;

public class PrintDuplicates
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			int count =0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				s1=s1+s.charAt(i);
			}
		}
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(!s2.contains(String.valueOf(s1.charAt(i))))
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
