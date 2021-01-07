package Arrays_and_Functions;

import java.util.Random;
import java.util.Scanner;

public class generalCount {

    static int[] freqArr = new int[1000000];

    static void count(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            freqArr[(arr[i])]++;
        }
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 0) {
                System.out.println((i) + "-->" + freqArr[i]);
            }
        }
    }

    static void countV2(int element) {
        freqArr[element]++;
    }

    static void showFreq() {
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 0) {
                System.out.println((i) + "-->" + freqArr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 10;

        Scanner input = new Scanner(System.in);
        int len;
        System.out.println("Enter Length of the array :");
        len = input.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter Numbers of the array ");

        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(upperbound);
            countV2(arr[i]);
        }
        showFreq();
        //count(arr);
    }

}
