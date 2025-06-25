package Tasks;

import java.util.Scanner;

public class Task_09_Triange_Classifier_Program {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                // Take input for 3 sides
                System.out.print("Enter side 1: ");
                int side1 = sc.nextInt();
                System.out.print("Enter side 2: ");
                int side2 = sc.nextInt();
                System.out.print("Enter side 3: ");
                int side3 = sc.nextInt();

                // Check if it's a valid triangle
                if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                    // Classify
                    if (side1 == side2 && side2 == side3) {
                        System.out.println("The triangle is equilateral.");
                    } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                        System.out.println("The triangle is isosceles.");
                    } else {
                        System.out.println("The triangle is scalene.");
                    }
                } else {
                    System.out.println("Not a valid triangle.");
                }

                sc.close();
            }
        }
