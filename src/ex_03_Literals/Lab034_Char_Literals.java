package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {

        char c1 = 'A'; //A to Z , a-z , !@#$%^&*()_+
        //char c ="A"; // ** == String = Bunch of char

        char c2 = '@';
        char c3 = '#';
        char c4 = '$';
        char c5 = '(';
        char c6 = '_';
        char c7 = '9';
        char c8 = 'H';
        char c9 = 'i';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';

        //Not use this ever
        char back_space ='\b';
        char carriage_return = '\r';

        System.out.println("RenukaPandey");
        System.out.println("Renuka" + new_line + "Pandey");
        System.out.println("Renuka" + tab_line + "Pandey");
        System.out.println("Renuka" + back_space+ "Pandey");
        System.out.println(" ------------ ");
        System.out.println(" Renuka is" + carriage_return +"Pandey");
        System.out.println(" Hello" + new_line +"People");

        char c10 = 'R';
        //character are part of integer
        //ASCII , (limited numbers) - A -> 65

        //char rupees = '$' --acceptable
        char my_laugh_smiley = '\u1f60';
        System.out.println(my_laugh_smiley);
    }
}
