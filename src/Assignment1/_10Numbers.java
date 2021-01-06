package Assignment1;


import java.util.Scanner;

public class _10Numbers {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        int [] arr=new int[10];
        int temp,max=0,min=-1,sum=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the num of index "+(i+1));
            temp=in.nextInt();
            arr[i]=temp;
            sum+=temp;
            if(max<temp)
                max=temp;
            if(min>temp)
                min=temp;
        }
        System.out.println("Max= "+max+"\nMin= "+min+"\nAverage= "+(sum/10));
}
    
}
