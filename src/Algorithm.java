public class Algorithm {
    public static void main(String[] args) {
        // + - * / % 5 basic operators
        int hf = 9, b = 4;
        System.out.println(b);
        System.out.println(5+2);
        System.out.println(5-2);
        System.out.println(5*2);
        System.out.println(5/2);
        System.out.println(5%2);//modulus calculations, the remainder is 1

        System.out.println(5.0+2);//one real number = the calculation get prompted
        System.out.println(5-2.0);
        System.out.println(5.0*2);
        System.out.println(5.02/2);
        System.out.println(5.5%2);//whatever I have left

        // the Math library
        System.out.println(Math.sqrt(9));
        Math.max(3,10);
        double a = Math.sqrt(1234);
        System.out.println(a);

        // random numbers
        Math.random(); // a random number from [0,1)
        System.out.println(Math.random());


        // random int number in a range from [bottom top]
        // (Math.random()*(top-bot+1)+bot)
        System.out.println((int)(Math.random()*(20)+1));






    }
}
