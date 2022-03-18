class demo
{
void getdata()
{
int i,j;
  
  for(i=1;i<10;i++)
  {
	for(j=1;j<=i;j++)
	{
	 System.out.print(i);
	}
	System.out.println();
  }
}
}

class print
{
 public static void main(String args[])
 {
  demo d = new demo();
  d.getdata();
 }
}


