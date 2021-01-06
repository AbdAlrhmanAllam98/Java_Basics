package Assignment1;


import java.util.Scanner;

public class Pythagorean_Theorem {

    static double pow(double base, int exp) {
        double power = 1.0;
        for (int i = 0; i < exp; i++) {
            power *= base;
        }
        return power;
    }

    static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    static double sqrt(double num) {
        if (num < 0) {
            return Double.NaN;
        } else if (num == 0) {
            return 0;
        } else {
            double size = num * 0.6;
            for (double i = 1.0; i < size; i += 0.2) {
                i = round(i, 1);
                if (num / i == i) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double m, n, a = 0, b = 0, c = 0;
        System.out.println("Enter 'm' side");
        m = in.nextDouble();
        System.out.println("Enter 'n' side");
        n = in.nextDouble();
        if (m >= n) {
            a = pow(m, 2) - pow(n, 2);
            b = (2 * m) * n;
            c = Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0));
        } else {
            System.out.println("'n' is greater than 'm'");
        }
        System.out.println("a= " + a + "\nb= " + b + "\nc= " + c);
    }

}
