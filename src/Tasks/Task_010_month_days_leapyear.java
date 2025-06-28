package Tasks;

import java.util.Scanner;  // ✅ Add this

public class Task_010_month_days_leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 Days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 Days");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                }
                break;
            default:
                System.out.println("Invalid month number!");
        }

        sc.close();
    }
}
