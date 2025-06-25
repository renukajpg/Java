package ex_10_For_Loop;

public class Lab106_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0) {
                        continue;  // skip even numbers
                    }
                    System.out.println(i + " is odd");
                }
            }
        }


