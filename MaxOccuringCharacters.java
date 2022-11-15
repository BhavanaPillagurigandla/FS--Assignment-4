import java.util.Scanner;

public class MaxOccuringCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		String s=sc.nextLine().toLowerCase().replace(" ", "");
		int num=0;
		int sum1=0;
		for(int i=0;i<s.length();i++)
		{
			int sum2=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					sum2++;
				}
			}
			if(sum2>sum1)
			{
				sum1=sum2;
				 num=i;
			}
		}
		System.out.println("Maximum occuring character "+s.charAt(num));

	}

}
