import java.util.*;

class Person
{
	public String name;
	public String gender;
	public String address;
	public int age;

	public Person(String n, String g, String add, int ag)
	{
		name=n;
		gender=g;
		address=add;
		age=ag;
	}
}

class Employee extends Person
{
	public String empid;
	public String company_name;
	public String qualification;
	public float salary;

	public Employee(String id, String c, String q, float sal, String n, String g, String add, int age)
	{
		super(n,g,add,age);
		empid=id;
		company_name=c;
		qualification=q;
		salary=sal;
	}
}

class Teacher extends Employee
{
public String subject;
public String department;
public String teacher_id;


public Teacher(String sub, String dept, String tid, String id, String c, String q, float sal, String n, String g, String add, int ag)
{
	super(id, c, q, sal, n, g, add, ag);

	subject=sub;
	department=dept;
	teacher_id=tid;
}

public void display()
{
	System.out.println("Teacher:");
	System.out.println("Name: "+name);
	System.out.println("Gender: "+gender);
	System.out.println("Address: "+address);
	System.out.println("Age: "+age);
	System.out.println(" ");
	System.out.println("Employee id: "+empid);
	System.out.println("Company name: "+company_name);
	System.out.println("Qualification: "+qualification);
	System.out.println("Salary: "+salary);
	System.out.println(" ");
	System.out.println("Teacher id: "+teacher_id);
	System.out.println("Subject: "+subject);
	System.out.println("Department: "+department);
}


public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter no. of teachers: ");
	int n = sc.nextInt();

	Teacher[] list = new Teacher[20];

	System.out.println("Enter teachers' data: \n\n");
	for (int i=0; i<n; i++)
	{
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter gender: ");
		String gen=sc.next();
		System.out.println("Enter age: ");
		int ag=sc.nextInt();
		System.out.println("Enter address: ");
		String ad=sc.next();

		System.out.println("Enter employee id: ");
		String eid=sc.next();
		System.out.println("Enter company name: ");
		String cn=sc.next();
		System.out.println("Enter qualification: ");
		String qu=sc.next();
		System.out.println("Enter salary: ");
		float salary=sc.nextFloat();

		System.out.println("Enter teacher id: ");
		String tid=sc.next();
		System.out.println("Enter subject: ");
		String sub=sc.next();
		System.out.println("Enter department: ");
		String dep=sc.next();

		list[i]= new Teacher(sub,dep,tid,eid,cn,qu,salary,name,gen,ad,ag);
	}

	System.out.println("\n\n Displaying teacher details: \n");
	for(int i=0; i<n; i++){
	list[i].display();
	System.out.println("\n\n");
	}
}

}


