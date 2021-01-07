package Arrays_and_Functions;

import java.util.Scanner;

public class countNumber2 {
     public static int count_2(int []arr)
    {
        int counter=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2)
                counter++;
        }
        return counter;
    }
         public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=input.nextInt();
        int []arr=new int [size];
        
        System.out.println("Enter the element of array ");
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        
        System.out.println("The Calculate Even is  "+count_2(arr));
        
    }
}
