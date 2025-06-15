package ex_02_JavaBasics_Part2;

public class Lab028_Final_Example {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI = 3.14f;
        //3.14 --> If will write only 3.14 it is treated as double
        //PI = 3.13f; This is final in nature
        System.out.println(PI);
    }
}
