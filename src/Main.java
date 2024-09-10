//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { //brace is the beginning of the class, method and such. This one starts the main method
    public static void main(String[] args) {
        System.out.print("Hello and welcome! ");// by removing ln, you smash them together, ; is a terminator
        System.out.println("how is everyone");
        System.out.println("\"this is the first line\nit is hot today!\"");//backslash controls the first character after it. \n means to return. \t means tab(4 spaces)
        System.out.println(7+8+9);
        System.out.println(7+" "+ 8+9);//the string disrupt the code
        System.out.println(7+8 +" "+9);//before the string it does do the calculation
        System.out.println(7+" "+ (8+9));//parenthesis will do the calculation(or make things unaffected)

        //variables
        //8 primary types of variables
            // 4 integer types byte [-128, 127], short [-32768, 32767], int [-2147483648, 2147483647], long[-2^64, 2^64-1] these are used to do different magnitude of calculation
            // 2 real types float-floating points, 32bits,7-8 digits of accuracy, double-double precision floating points,64bits, 15-16 digits of accuracy.
            // 1 unsigned "integer" type: char, short for single character, single quote around the char. They are stored numerically
                // 'A' -> 65 'B'-> 66 1000001
                // ' ' -> 32 0100000
                // 'a' -> 97 this is after the capital Z 1100001
                // '0' -> 48

                char let = 'q';
                char l = 65;
                System.out.println( (int) let);
                System.out.println(l);

                int bob = 200000;
                bob = let + l; //bob is redefined, stored as a new character
                System.out.println( (int) bob);

                System.out.println(Integer.MAX_VALUE);

                // 1 boolean type true, false
                System.out.println('A');

        long b = 2000000001;
        System.out.println(2*b);// did not exceed the limit of long value
        double fl = 2.2 + 2.1; //this print a weird number, due to some issues in java
        System.out.println(fl);




    }// end of a method
}

/*comment sample, this comment can
last multiple lines, whereas '' can not */
