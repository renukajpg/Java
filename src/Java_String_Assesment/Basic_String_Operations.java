package Java_String_Assesment;

public class Basic_String_Operations {
    public static void main(String[] args) {

        //1.String Initilization
        String str1 = "hello";
        String str2 = "Renuka";

        //2. Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        //3.Length of the string
        System.out.println("Length: " + result.length());

        //4.Substring (From index 0  to 5)
        String sub = result.substring(0, 5);
        System.out.println("substring (0,5):" + sub);

        //5. Charcter extraction
        char ch = result.charAt(1);
        System.out.println("Character at index 1: "+ ch);
    }
}
