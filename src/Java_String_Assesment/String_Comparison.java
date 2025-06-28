package Java_String_Assesment;

public class String_Comparison {
        public static void main(String[] args) {

            String str1 = "Java";
            String str2 = "Java";
            String str3 = new String("Java");
            String str4 = "java";

            // Using == operator (compares memory address)
            System.out.println("Using == : " + (str1 == str2));   // true
            System.out.println("Using == : " + (str1 == str3));   // false

            // Using equals() (compares content, case-sensitive)
            System.out.println("Using equals(): " + str1.equals(str3));  // true
            System.out.println("Using equals(): " + str1.equals(str4));  // false

            // Using equalsIgnoreCase() (ignores case)
            System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str4)); // true

            // Using compareTo() (lexicographical, case-sensitive)
            System.out.println("Using compareTo(): " + str1.compareTo(str2));  // 0
            System.out.println("Using compareTo(): " + str1.compareTo(str4));  // negative
        }
    }

