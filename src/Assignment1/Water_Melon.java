package Assignment1;

import java.util.*;
public class Water_Melon {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the weight of the watermelon ");
        int weight=in.nextInt();
        if((weight>=1)&&(weight<=100))
        {
            if(weight%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("the weight is not in limit ");
    }
}