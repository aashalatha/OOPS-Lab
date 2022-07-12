import java.util.*;

interface shape
{
    double pi =3.14;
    double area(double x,double y);
    double perimeter(double x,double y);
}

class cir implements shape
{
    public double area(double x,double y)
    {
        return (pi*x*x);
    }
    public double perimeter(double x,double y)
    {
        return (2*pi*x);
    }
}
class rect implements shape
{
    public double area(double x,double y)
    {
        return x*y;
    }
    public double perimeter(double x,double y)
    {
        return 2*(x+y);
    }
}

class interfacetest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double a,b;
        while(true)
        {
            System.out.println("\nMENU");
            System.out.println("1.Circle");
            System.out.println("2.Rectangle");
            System.out.println("3.Exit");

            System.out.println("\nEnter your choice:");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                shape obj = new cir();
                System.out.println("Enter the radius of the circle:");
                a = sc.nextDouble();
                System.out.println("Area of Circle:"+obj.area(a,0.0));
                System.out.println("Perimeter of Circle:"+obj.perimeter(a,0.0));
                break;

                case 2:
                shape obj1 = new rect();
                System.out.println("Enter the length and breadth of rectangle:");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Area of Rectangle:"+obj1.area(a,b));
                System.out.println("Perimeter of Rectangle:"+obj1.perimeter(a,b));
                break;
                
                case 3:
                System.out.println("Exiting the application!!!");
                System.exit(0);
                
                default:
                System.out.println("Invalid Choice!!!");
                break;
            }
        }
    }
}