import java.util.Scanner;
class Auto
  {
    public static void main(String args[])
      {
       Scanner sc=new Scanner(System.in);
       int n,sq,r,d;
       n=sc.nextInt();
       sq=n*n;
        d=(int)Math.log10(n)+1;
        r=sq%(int)Math.pow(10,d);
       if(r==n)
           System.out.println("Automorphic Number");
       else
           System.out.println("Not an Automorphic Number");
       sc.close();
        
         
    
       
      }
  }