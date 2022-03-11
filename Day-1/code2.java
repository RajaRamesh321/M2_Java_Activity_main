import java.util.Scanner;

public class code2 {
	public static boolean lastnamesame(String s1, String s2)
	{
		int b1=-1,b2=-1,i;
		String s3, s4;
		for(i=0;i<s1.length();i++)
		{
			if(Character.isWhitespace(s1.charAt(i)))
			{
				b1=i;
			}
		}
		for(i=0;i<s2.length();i++)
		{
			if(Character.isWhitespace(s2.charAt(i)))
			{
				b2=i;
			}
		}
		s3=s1.substring(b1);
		s4=s2.substring(b2);
		if(s3.equalsIgnoreCase(s4))
		{
			return true;
		}
		else
		{
		    return false;
		}
	}

	public static void main(String[] as) {
		Scanner sc=new Scanner(System.in);
		String n1,n2;
		System.out.println("Enter names:");
		n1=sc.nextLine();
		n2=sc.nextLine();
		if(lastnamesame(n1,n2)== true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}

