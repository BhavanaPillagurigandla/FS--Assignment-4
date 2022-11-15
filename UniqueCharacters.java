import java.util.Scanner;
public class UniqueCharacters
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Str= ");
		String s=sc.nextLine().toLowerCase().replace(" ","");
		boolean sum =true;
		for(int i=0;i<s.length();i++)
		{
			int num=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					num++;
				}
			}
			if(num>1)
			{
				System.out.println("String is not contains unique characters");
				sum=false;
				break;
			}
		}
		if(sum==true)
		{
			System.out.println(s+" is contains UNIQUE characters");
		}
	}

}
