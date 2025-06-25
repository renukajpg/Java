package ex_09_Switch;

import java.util.Scanner;

public class Lab085_SwitchwithsString {
    public static void main(String[] args) {  // ✅ Add main method
        String day = new Scanner(System.in).nextLine().toLowerCase();

        switch (day) {
            case "sunday": System.out.println("It's Sunday"); break;
            case "monday": System.out.println("It's Monday"); break;
            case "tuesday": System.out.println("It's Tuesday"); break;
            case "wednesday": System.out.println("It's Wednesday"); break;
            case "thursday": System.out.println("It's Thursday"); break;
            case "friday": System.out.println("It's Friday"); break;
            case "saturday": System.out.println("It's Saturday"); break;
            default: System.out.println("Invalid day name!");
        }
    }
}
