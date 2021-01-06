package Assignment1;

import java.util.Scanner;
public class MinandMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, max = 0, min = 0;
        System.out.println("Enter the First Number ");
        num1 = in.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = in.nextInt();
        System.out.println("Enter the third Number ");
        num3 = in.nextInt();
        if ((num1 > num2) && (num1 > num3)) {
            max = num1;
            if (num2 > num3) {
                min = num3;
            } else {
                min = num2;
            }
        } else if ((num2 > num1) && (num2 > num3)) {
            max = num2;
            if (num1 > num3) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            max = num3;
            if (num1 > num2) {
                min = num2;
            } else {
                min = num1;
            }
        }
        System.out.println("Max=" + max + "\n" + "Min=" + min);
    }
}
