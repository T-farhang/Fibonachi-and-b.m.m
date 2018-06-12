/*
                Tahereh Farhang , Barbod Accademy , 2nd session , 8th excercise.
                            fibonachi and b.m.m
 */
package fibonachi.and.b.m.m;

import java.util.Scanner;

/**
 *
 * @author Totia
 */
public class FibonachiAndBMM {

    // declare fibonachi method
    public static int fibonachi(int num) {
        int result;
        if (num <= 1) {
            result = num;
        } else {
            result = fibonachi(num - 2) + fibonachi(num - 1);
        }
        return result;
    }

    // declare b.m.m method
    public static int bmm(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        } else {
            return bmm(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // calling fibonachi method
        System.out.print("enter your number : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(fibonachi(i) + "\t");
        }

        // caling b.m.m method
        System.out.println("Please enter your first number for BMM : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter your second number for BMM : ");
        int num2 = sc.nextInt();

        int b = bmm(num1, num2);
        System.out.println(String.format("BMM %d and %d is %d . ", num1, num2, b));
    }

}
