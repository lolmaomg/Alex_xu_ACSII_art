import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class input_assignment {
        public static void main(String[] args) throws FileNotFoundException {
            //scanner object in the Java util library
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number");
            int answer = sc.nextInt(); //waiting for input of integer and store that integer.
            System.out.println("What is your name");
            sc.nextLine();//get rid of the trash
            String name = sc.nextLine();//
            System.out.println("Please enter the your average grade of English, Math and Comp Sci, respectively ");
            double English = sc.nextDouble();
            double Math = sc.nextDouble();
            double Comp_Sci = sc.nextDouble();// not going to work until you input
            System.out.println("Are you a Texas resident, please enter True or False");
            Boolean Texas = sc.nextBoolean();
            System.out.println("Your number is " + answer + "Your name is " + name + "Your average grade is " + English + " " + Math + "" + Comp_Sci);
            System.out.println("It is " +Texas+ " that you're a Texas resident");

            Scanner infile = new Scanner(new File("New Text Document.txt"));
            double b1 = infile.nextDouble();
            double b2 = infile.nextDouble();
            infile.close();






    }

}
