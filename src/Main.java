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
        for (int i = 1; i <= 5; i++) {

            //this line does something
            System.out.println("i = " + i);
        }
    }// end of a method
}

/*comment sample, this comment can
last multiple lines, whereas '' can not */
