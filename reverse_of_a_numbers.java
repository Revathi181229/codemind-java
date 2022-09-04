import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,sum=0,r;
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
         r=n%10;
         sum=sum*10+r;
         n=n/10;
        }
        System.out.println(sum);
    }
}