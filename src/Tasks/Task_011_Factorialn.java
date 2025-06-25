package Tasks;

import java.util.Scanner;

public class Task_011_Factorial_of_N {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), f = 1;

        if (n < 0) {
            System.out.println("Negative not allowed");
        } else if (n > 12) {
            System.out.println("Too large for int");
        } else {
            for (int i = 1; i <= n; i++) f *= i;
            System.out.println(f);
        }
