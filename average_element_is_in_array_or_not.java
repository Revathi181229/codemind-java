import java.util.Scanner;
class max
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n,i,x[],avg,sum=0,c=0,cnt=0;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
     x[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        sum=sum+x[i];
        c++;
    }
    avg=sum/c;
    for(i=0;i<n;i++)
    {
        if(x[i]==avg)
         cnt++;
    }
    if(cnt==0)
     System.out.println("False");
    else
     System.out.println("True");
   }
}