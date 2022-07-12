import java.util.Scanner;

interface product
{
    void displayproduct();
    int calculate();
}
class Bill implements product
{
    String p_name;
    int pid,qty,uprice,total;
    Bill(int id,String p,int q,int u)
    {  
        pid = id;
        p_name = p;
        qty = q;
        uprice = u;
    }
    public int calculate()
    {
        total = uprice * qty;
        return total;
    }
    public void displayproduct()
    {
        System.out.print("  "+pid+"\t\t"+p_name+"\t\t"+qty+"\t\t"+uprice+"\t\t"+total+"\n");
    }
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products:");
        int n = sc.nextInt();
        Bill[] B = new Bill[20];
        int sum = 0;
        System.out.println("Enter the products:");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the product id:");
            int pid = sc.nextInt();
            System.out.println("Enter product name:");
            String p_name = sc.next();
            System.out.println("Enter quantity:");
            int qty = sc.nextInt();
            System.out.println("Enter unit price:");
            int uprice = sc.nextInt();
            B[i] = new Bill(pid,p_name,qty,uprice);
            sum += B[i].calculate();
        }
        System.out.println("Order no:");
        System.out.println("\nDate:");
        System.out.println("\n  Product Id      Name        Quantity        Unit Price      Total");
        System.out.println("----------------------------------------------------------------------");
        for (int i=0;i<n;i++)
        {
            B[i].displayproduct();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\n\t\t\tNet Amount = "+sum);
        sc.close();
    }
}