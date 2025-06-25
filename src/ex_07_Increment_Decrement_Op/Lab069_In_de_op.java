package ex_07_Increment_Decrement_Op;

public class Lab_069_In_de_op {
        public static void main(String[] args) {

                // Check if enough arguments are passed
                if (args.length < 4) {
                        System.out.println("Please provide 4 arguments: <age> <a1> <a2> <a3>");
                        return;
                }

                // Take inputs
                String age_string = args[0];
                String a1 = args[1];
                String a2 = args[2];
                String a3 = args[3];

                int age = Integer.parseInt(age_string);

                // Print values
                System.out.println("Age: " + age);
                System.out.println("A1: " + a1);
                System.out.println("A2: " + a2);
                System.out.println("A3: " + a3);
        }
}
