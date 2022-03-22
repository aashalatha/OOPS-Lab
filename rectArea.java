class rectangle
{
 int length,width;
 void getdata(int x, int y)
 {
   length = x;
   width = y;
 }
 int calculatearea()
 {
   int area = length * width;
   return(area);s
 }
}

class rectArea
{
	public static void main(String args[])
	{
		int area1,area2;
		rectangle rect1 = new rectangle();
		rectangle rect2 = new rectangle();
		rect1.length = 15;
		rect1.width = 10;
		area1 = rect1.length * rect1.width;
		rect2.getdata(20,12);
		area2 = rect2.calculatearea();
		System.out.println("Area1 = " + area1);
		System.out.println("Area2 = " + area2);
	}
}
