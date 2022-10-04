import java.util.Scanner;
class HandShake
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,hs;
        n=sc.nextInt();
        hs=n*(n-1)/2;
        System.out.println(hs);
        
    }
}