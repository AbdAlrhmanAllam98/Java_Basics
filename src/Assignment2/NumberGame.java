package assignment2;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args){  
    Scanner input=new Scanner(System.in);
    int T,number,counter;
        System.out.println("Enter the number of test cases");
    T=input.nextInt();
    for(int i=0;i<T;i++)
    {
        System.out.println("Enter the number to play");
        number=input.nextInt();
        counter=0;
        if(number>1&&number<1000000000)
        {
        while(number!=0)
        {
            counter++;
            if(number%2==0)
                number/=2;
            else
                number-=1;
        }
        if(counter%2==0)
            System.out.println("Akash");
        else
            System.out.println("Aayush");
    }
        else
            System.out.println("the number is not in limit");
    }
}
}
