import java.util.*;
class method
{
    void calcarea(float base,float height)
    {
        double area=0.5*base*height;
        System.out.print("Area of Triangle with base: "+base+" and height: "+height+" is: "+area);
        System.out.print("\n");
    }
    void calcarea(int width,int length)
    {
        int area=width*length;
        System.out.print("Area of Rectangle with width: "+width+" and length: "+length+" is: "+area);
        System.out.print("\n");
    }
    void calcarea(float r)
    {
        double area=3.14*r*r;
        System.out.print("Area of Circle with radius: "+r+" is: "+area);
        System.out.print("\n");
        
    }
}
public class area
{
    public static void main(String[] args)
    {
        int recw,rech;
        float baset,heightt,radiusc;
        method ob=new method();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Base of the Triangle\n");
        baset=sc.nextFloat();
        System.out.print("Enter the Height of the Triangle\n");
        heightt=sc.nextFloat();
        System.out.print("Enter the width of the Rectangle\n");
        recw=sc.nextInt();
        System.out.print("Enter the Height of the Rectangle\n");
        rech=sc.nextInt();
        System.out.print("Enter the Radius of the Circle\n");
        radiusc=sc.nextFloat();
        ob.calcarea(baset,heightt);
        ob.calcarea(recw,rech);
        ob.calcarea(radiusc);
    }
}
