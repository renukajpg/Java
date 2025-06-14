package ex_02_JavaBasics_Part2;

public class Lab023_Byte {
    public static void main(String[] args) {

        byte age = 10;
        //How data of age get stored in the memory?
        //Memory can store only decimal value = false
        //Memory can store 0 & 1 --> True
        System.out.println(age);

    }

    public static void main(int args) {

        byte age = 11;
        System.out.println(age);
    }
}
//1 byte = 8 bits --> store
// Why we can't store this byte b = 128
// 128 --> 8 bits -> it get's overflowed