package Assignment1;

import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        int temp,size,positive=0,negative=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=in.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the num of index "+(i+1));
            temp=in.nextInt();
            arr[i]=temp;
            if(temp>=0)
                positive+=arr[i];
            else
                negative+=arr[i];
        }
        System.out.println("Sum of positive numbers is "+positive+"\nSum of negative numbers is "+negative);
    }
    

}
