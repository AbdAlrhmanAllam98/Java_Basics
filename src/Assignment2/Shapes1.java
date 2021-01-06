package assignment2;
import java.util.Scanner;
public class Shapes1 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=in.nextInt();
    for(int i=n;i>0;i--)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
