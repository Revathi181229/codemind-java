import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,a,b,i,x[],max=0,c=0;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
     x[i]=sc.nextInt();
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(x[i]>=a && x[i]<=b)
        {
            if(x[i]>max)
            {
                c++;
                max=x[i];
            }
        }
    }
    if(c==0)
     System.out.println("-1");
    else
     System.out.println(max);
    }
}