import java.util.*;

public class prime {

	public static void main(String[] args) 
	{
		int num,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the number");
			 num=sc.nextInt();
			 if(num==0||num==1)
				 System.out.println("\n"+num+"is not a prime number");
			 else
			 {
				 for(int i=2;i<=num/2;i++)
				 {
					 if(num%i==0)
					 {
						 flag=1;
						 break;
					 }
				 }
				 if(flag==0)
					 System.out.print("\n"+num+" is a prime number");
				 else
					 System.out.print("\n"+num+" is not a prime number");
			 }

	}

}
