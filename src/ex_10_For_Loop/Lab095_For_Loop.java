package ex_10_For_Loop;

public class Lab_095_For_Loop {
    public static void main(String[] args) {
        int n = 5;  // Example input, you can change this or take input from user
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
