import java.util.Scanner;

public class CheckPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num=");
		String num=sc.nextLine();
		String s="";
		for(int i=num.length()-1;i>=0;i--)
		{
			s=s.concat(String.valueOf(num.charAt(i)));
		}
		if(num.equals(s))
		{
			System.out.println(num+" is a palindrome");
		}
		else
		{
			System.out.println(num+" is Not a palindrome");
		}

	}

}
