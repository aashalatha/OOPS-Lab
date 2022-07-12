import java.util.*;

class MyException extends Exception
{
    public MyException(String value)
    {
        super(value);
    }
}
class Exception1
{
public static void main(String args[])
{
    int totalnums,i,temp,count=0,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Total numbers:");
    totalnums = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the numbers:");
    for(i=0;i<totalnums;i++)
    {
        try
        {
            temp = Integer.parseInt(sc.nextLine());
            if(temp>0)
            {
                sum+= temp;
                count+=1;
            }
            else
            {
                throw new MyException(Integer.toString(temp));
            }
        }catch(MyException e)
        {
            System.out.println(e.getMessage()+":Not a positive number");
        }
    }
    System.out.println("Count:"+count);
    System.out.println("Sum:"+sum);
    System.out.println("Average:"+(sum/count));
    sc.close();
}
}