import java.util.*;

public class reverse {

	public static void main(String[] args)
	{
		String str, rev="";
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the string to be reversed");
		str=sc.next();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+str.charAt(i);
		System.out.print("\n The reversed string is "+rev);

	}

}
