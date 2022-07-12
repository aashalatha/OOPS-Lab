import Graphics.*;
import java.util.*;

class Graphictest{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

Graphics.Rectangle r = new Graphics.Rectangle();
Graphics.Square s = new Graphics.Square();
Graphics.Circle c = new Graphics.Circle();
Graphics.Triangle t = new Graphics.Triangle();

int ch=1, flag, a, b;
float x,y;

do{

System.out.println("Select a shape: ");
System.out.println("1 - Rectangle ");
System.out.println("2 - Square ");
System.out.println("3 - Circle ");
System.out.println("4 - Triangle ");

flag=sc.nextInt();

switch(flag){

case 1: System.out.println("Enter length: ");
	a=sc.nextInt();
	System.out.println("Enter breadth: ");
	b=sc.nextInt();
	r.area(a,b);
	break;

case 2:System.out.println("Enter side: ");
	a=sc.nextInt();
	s.area(a);
	break;

case 3:System.out.println("Enter radius: ");
	x=sc.nextFloat();
	c.area(x);
	break;

case 4:System.out.println("Enter base: ");
	x=sc.nextFloat();
	System.out.println("Enter height: ");
	y=sc.nextFloat();
	t.area(x,y);
	break;

default: System.out.println("Invalid choice");
}



System.out.println("Press 0 to EXIT - any other to continue");
ch=sc.nextInt();

}while(ch!=0);
}

}
