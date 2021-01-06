package Assignment1;


import java.util.*;

public class Sorting_Three_Floating {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter he First Number ");
        num1 = in.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = in.nextInt();
        System.out.println("Enter the third Number ");
        num3 = in.nextInt();
        if ((num1 > num2) && (num1 > num3)) {
            if (num2 > num3) {
                System.out.println(num3 + "\n" + num2 + "\n" + num1);
            } else {
                System.out.println(num2 + "\n" + num3 + "\n" + num1);
            }
        } else if ((num2 > num1) && (num2 > num3)) {
            if (num1 > num3) {
                System.out.println(num3 + "\n" + num1 + "\n" + num2);
            } else {
                System.out.println(num1 + "\n" + num3 + "\n" + num2);
            }
        }
        else
        {
            if(num1>num2)
               System.out.println(num2+"\n"+num1+"\n"+num3);
           else
               System.out.println(num1+"\n"+num2+"\n"+num3);
        }
    }

}
