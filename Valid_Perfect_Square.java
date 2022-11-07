import java.util.Scanner;
class Per
{
    public static boolean isSquare(int n)
    {
        for(int i=1;i<n;i++)
        {
            if((i*i)==n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            if(isSquare(n))
             System.out.println("True");
            else
             System.out.println("False");
        }
        
    }
}