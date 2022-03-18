class distance
{
int meter;
double centim;

	void getdata()
	{
	 meter = 10;
	 centim = 25.5;
	}
}

class demo
{
	public static void main(String args[])
	{
	 distance d = new distance();
	 d.getdata();
	 System.out.println("Meter is "+ d.meter);
	 System.out.println("Centimeter is "+ d.centim);
	}
}
