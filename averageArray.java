import java.util.*;
public class avg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows in array:");
        int m1=sc.nextInt();
        System.out.print("Enter the no of columns in array:");
        int n1=sc.nextInt();
        int array[][]=new int[m1][n1];
        System.out.print("Enter elements: ");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int totallength=0;
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                sum=sum+array[i][j];
                totallength++;
            }
        }
        int avg=sum/(totallength);
        System.out.print("Average is: "+avg);
        
    }
}
