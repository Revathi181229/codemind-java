import java.util.Scanner;
class disk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,c;
        t=sc.nextInt();
        b=sc.nextInt();
        s=sc.nextInt();
        c=2*512*t*s*b;
        System.out.println(c);
        sc.close();
    }
}