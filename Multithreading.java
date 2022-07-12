import java.util.*;

class Even implements Runnable
{
int s, n;

public Even(int s, int n)
{
this.s=s;
this.n=n;
}

public void run()
{

for(int i=s; i<=n; i++)
{
if (i%2==0)
{
System.out.println(" "+i);
}
} 

}

}

class Fibonacci implements Runnable
{
int n;

	public Fibonacci(int n)
	{
		this.n=n;
	}

	public void run()
	{
		int a,b,c,i;
		a=c=i=0;
		b=1;


		System.out.print(a+" "+b);
		for(i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}
}

class Multithreading
{

public static void main(String args[])
{ 
Scanner sc = new Scanner(System.in);

System.out.println("Enter the limit for fibonacci series:");
int n=sc.nextInt();
Thread t1 = new Thread(new Fibonacci(n));
t1.run();

System.out.println("\nEnter Starting range for even numbers: ");
int s=sc.nextInt();
System.out.println("Enter Ending range for even numbers: ");
n=sc.nextInt();
System.out.print("The even numbers are: ");
Thread t2 = new Thread(new Even(s,n));
t2.start();

}

}
