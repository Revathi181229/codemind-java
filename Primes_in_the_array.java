import java.util.Scanner;
class prime
{
    public static boolean isPrime(int n)
    {
        if(n<2)
          return false;
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        
           
        for(i=0;i<n;i++)
        {
            if (isPrime(x[i]))
        
                 c++;
        }
        System.out.println(c);
    }
}