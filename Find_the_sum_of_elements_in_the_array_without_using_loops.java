import java.util.Scanner;
class Sum
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           sum=sum+x[i]; 
        }
        System.out.println(sum);
    }
}