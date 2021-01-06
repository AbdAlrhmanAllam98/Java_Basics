package assignment2;

import java.util.Scanner;
public class cosin {
    static Scanner input=new Scanner(System.in);
    static double cos=1;
    static int counter=1;
    static int fact=1;
    
    static void cosinX(int n,double x)
    { 
        for(double i=2;i<=n;i+=2)
        {
            
            counter++;
            //factorial for denominator
            for(double j=i;j>0;j--)
                 fact*=j;
            if(counter%2==0)
                cos-=Math.pow(x, i)/fact;
            else
               cos+=Math.pow(x, i)/fact; 
            
        }
        System.out.println(cos);
    }
    static void cosX_V2(int n,double x)
    {
        int sign=1;
        cos=0;
        double power=1;
        for(int i=0;i<=n;i++)
        {
            
            if(i!=0)
                fact*=i;
            if(i%2==0)
            {
                cos+=(power/fact)*sign;
                sign*=-1;
            }
            power*=x;      
        }
        System.out.println(cos);
    }
    public static void main(String[] args) {
        int n;
        double x;
        System.out.println("Enter 'n' ");
        n=input.nextInt();
        System.out.println("Enter 'x' ");
        x=input.nextDouble();
        System.out.println("1-Enhanced CosinX Function\n2-Normal CosinX");
        int option=input.nextInt();
        if(option==1)
            cosX_V2(n, x);
        else if(option==2)
            cosinX(n, x);
        else
            System.out.println("Invalid Input");
    }
}
