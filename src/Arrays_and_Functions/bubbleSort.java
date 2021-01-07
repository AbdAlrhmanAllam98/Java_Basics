package Arrays_and_Functions;

import java.util.Scanner;

public class bubbleSort {

    static void bubbleSort(int arr[]) {
        int size = arr.length;
        for (int j = size - 1; j >= 0; j--) {
            for (int i = 1; i <= j; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        System.out.println("********************************");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    static void optimizedBubbleSort(int arr[]) {
        int size = arr.length;
        for (int j = size - 1; j >= 0; j--) {
            boolean swapped = true;
            for (int i = 1; i <= j; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = false;
                }
            }
            if (swapped == true) {
                break;
            }
        }
        System.out.println("********************************");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size, option;
        long startTime = 0, endTime = 0;
        System.out.println("Enter the size of array ");
        size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("1-Normal Bubble sort\n2-Optimized Bubble sort");
        option = input.nextInt();
        if (option == 1) {
            startTime = System.currentTimeMillis();
            bubbleSort(arr);
            endTime = System.currentTimeMillis();
        } else if (option == 2) {
            startTime = System.currentTimeMillis();
            optimizedBubbleSort(arr);
            endTime = System.currentTimeMillis();
        }
        System.out.println("");
        System.out.println("total time :"+(endTime-startTime));
    }
}
