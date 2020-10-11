import java.util.*;

public class secondsmallest 
{

	public static void main(String[] args)
	{
		int size,temp;
		int[] array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the size of the array:");
		size=sc.nextInt();
		System.out.println(" Enter the array elements: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(array[i]>array[i+1])
			{	
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		System.out.println("\n The second smallest element in the array is:" +array[1]);
		
	 }
}
