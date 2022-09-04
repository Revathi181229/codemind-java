import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,r,sum=0,sq;
        n=sc.nextInt();
        sq=n*n;
        while(sq>0)
        {
          r=sq%10;
          sum=sum+r;
          sq=sq/10;
        }
        if(sum==n)
         System.out.println("Neon Number");
        else
         System.out.println("Not Neon Number");
    }
}