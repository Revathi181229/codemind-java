import java.util.Scanner;
class cf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float f;
        n=sc.nextInt();
        f=(float)(9*n)/5+32;
        System.out.format("%.2f",f);
    }
}