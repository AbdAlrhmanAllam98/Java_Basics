package assignment2;
import java.util.Scanner;
public class HarmonicSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n;
        double sumLeftToRight = 0,sumRightToLeft = 0;
         n=input.nextInt();
        for(double i=1;i<=n;i++)
            sumLeftToRight+=1.0/i;
        System.out.println(sumLeftToRight);
        for(double i=n;i>0;i--)
            sumRightToLeft+=1.0/i;
         System.out.println(sumRightToLeft);
        System.out.println("The Difference is "+Math.abs(sumLeftToRight-sumRightToLeft));
    }
}
