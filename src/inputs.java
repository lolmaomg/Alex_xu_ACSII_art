import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class inputs {
    public static void main(String[] args) throws FileNotFoundException {
        //scanner object in the Java util library
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your student");
        int answer = sc.nextInt(); //waiting for input of integer and store that integer.
        System.out.println("What is your name");
        sc.nextLine();//get rid of the trash
        String name = sc.nextLine();//
        System.out.println("Please enter 3 real numbers");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();// not going to work until you input

        System.out.println("Your number was " + answer);
        System.out.println("Your name is " + name);

        Scanner infile = new Scanner(new File("New Text Document.txt"));
        double b1 = infile.nextDouble();
        double b2 = infile.nextDouble();
        infile.close();




    }

}
