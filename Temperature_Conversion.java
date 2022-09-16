import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int c;
      float F;
      c=sc.nextInt();
      F=(float)(9*c)/5+32;
      System.out.format("%.2f",F);
    }
}