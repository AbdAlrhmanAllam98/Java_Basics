package Arrays_and_Functions;

import java.util.Scanner;

public class getMin {

    public static int getmin(int[] arr) {
        int min = 10000;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The minimum value is  " + getmin(arr));
    }
}
