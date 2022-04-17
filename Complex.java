import java.util.*;

public class Complex{

double real;
double image;

Complex(double r, double i){

real =r;
image =i;

}

public static Complex sum(Complex c1, Complex c2){

Complex c = new Complex(0,0);
c.real = c1.real + c2.real;
c.image = c1.image + c2.image;

return c;

}

public static void main(String args[]){

Complex c1 = new Complex(5.3,2);
Complex c2 = new Complex(7,3.1);

Complex c3 = sum(c1,c2);

System.out.println("Complex number 1: "+c1.real+" + "+c1.image+" i");
System.out.println("Complex number 2: "+c2.real+" + "+c2.image+" i");

System.out.println("Sum: "+c3.real+" + "+c3.image+" i");


}

}