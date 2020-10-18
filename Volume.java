import java.util.*;
class example
{
    void volume(int r)
  {
    double vol=(4.0/3)*3.14*r*r*r;
    System.out.println("Volume of sphere: "+vol);
  }

   void volume(int h,int r)
  {
    double vol=3.14*r*r*h;
    System.out.println("Voloume of cylinder: "+vol);
  }
}  
public class q3
 {
     public static void main(String[] args)
     {
         int sr,cr,ch;
         Scanner sc=new Scanner(System.in);
         example ob=new example();
         System.out.print("Enter radius of sphere:");
         sr=sc.nextInt();
         System.out.print("Enter radius of cylinder:");
         cr=sc.nextInt();
         System.out.print("Enter height of cylinder:");
         ch=sc.nextInt();
         ob.volume(sr);
         ob.volume(cr,ch);
         
         
     }
 }
