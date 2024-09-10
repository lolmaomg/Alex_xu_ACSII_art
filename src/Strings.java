import static java.lang.System.out;




public class Strings {

    public static void main(String[] args) {
        //String is immutable
        //no modifier methods
        //not a primitive data type
        String name = "Mr. Black";
        // name = "Jojo";
        //String teacher = "Black";

        String school = new String("All Saints");
        String teacher = new String("Mr. Black");
        out.println(school);


        out.println(teacher.charAt(0));//character at a location
        out.println(school.charAt(5));//index can't go over the length of the object


        out.println(name.length());//get the length of a word
        out.println(school.substring(5));//getting anything starting from 5
        out.println(school.substring(2,7));//getting substring from 2 to 6, 7 is not included.


        out.println(name.indexOf("Black"));//exact match, tells you where it starts if it exists
        out.println(school.indexOf("l"));//looks from the left
        out.println(school.lastIndexOf("l"));//looks from the right


        //comparisons
        out.println(teacher == school);//outputs a boolean value
        out.println(teacher == name);//is a bad way to check equivalency
        out.println("All Saints" == school);//same thing, bad. Don't do it

        out.println(name.equals(teacher));//this is how your compare the internal values and output a good boolean
        out.println(school.equals(name));
        out.println("All Saints".equals(school)); //good

        //to compare to strings
        out.println(name.compareTo(school));// mathematical difference of the first character of two strings, how far they are apart
        out.println(school.compareTo(name));// first - next , resulting in a negative value
        String teacher1 = "Mr .Black's Cat";
        out.println(name.compareTo(teacher1));//for every character pass it gives you -1
        out.println(teacher1.compareTo(name));//opposite

        //concatenation
        out.println(school + " school");//don't get a space for free += doesn't work in this case

        // parsing numeric strings to numeric values
        String strNum = "123";
        String strNum2 = "456";
        int num1  = Integer.parseInt(strNum); //convert strings to integers
        int num2  = Integer.parseInt(strNum2);
        out.println(strNum + strNum2);
        out.println(num1 + num2);
        double val1 = Double.parseDouble(strNum);// convert strings to double
        String ans = "nottrue";
        boolean answer = Boolean.parseBoolean(ans);
        out.println(answer);
        String bob = "" + num1;//no need to convert num1


        //
        out.println(school.toUpperCase());
        out.println(school.toLowerCase());
        out.println(school.replaceAll("l", "abc"));//replace regex with replacement
        out.println(school.trim()); // no extra space in the front or the back







    }
}