import java.util.Scanner;
class IsPP
{
    public static boolean Isprime(int n)
    {
        if(n<2)
         return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(Isprime(i))
             System.out.println(i);
            
        }
    }
}