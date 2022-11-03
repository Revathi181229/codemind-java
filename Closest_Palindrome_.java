import java.util.Scanner;
class closest_palindrome
{
    public static boolean pal(int n)
    {
        int r=0,rev=0,t=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(t==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d1,d2;
        a=sc.nextInt();
        for(int i=a-1;;i--)
        {
            if(pal(i))
            {
                d1=i;
                break;
            }
        }
       for(int i=a+1;;i++)
        {
            if(pal(i))
            {
                d2=i;
                break;
            }
        }
        if((a-d1)==(d2-a))
        {
            System.out.print(d1+" "+d2);
        }
        else if((a-d1)<(d2-a))
        {
            System.out.println(d1);
        }
        else
        {
            System.out.println(d2);
        }
    }
}
