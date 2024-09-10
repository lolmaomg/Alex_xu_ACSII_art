public class shorthand {
    public static void main(String[] args) {

        //shortcut
        int x = 5;
        x += 10; // x = x+10
        x++; // adds 1 to x
        x--; //the decreaser
        System.out.println(x++);//executed in the next line
        System.out.println(++x);// execute immediately
        System.out.println(x);


        //instantiate
        Bird tweety = new Bird();
        tweety.speak();
        tweety.move();
        tweety.getage();
        Bird jojo = new Bird("Jojo", 0);
        System.out.println(tweety.getage());; //actual parameters
        mylibrary.printHeading();
        System.out.println(tweety.getage());
        System.out.println(tweety.getage());

        //String.format()
        double ans = mylibrary.mult2nums(5,10);
        System.out.println("the number is" +String.format("%.2f", ans));// f is the floats/doubles 2 is the number of decimal places
        //d = integers, s = strings
        System.out.println(String.format("%6d", 25));//6 the number of spaces to fill up
        System.out.println(String.format("%-6d", 25));
        System.out.println(String.format("%06d", 25));//0 to replace spaces

        Dog d = new Dog( "rover" );
        System.out.println( d.getPeopleAge(7) );
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println( d.getPeopleAge( 11 ) );
        System.out.println( d.getName() );
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println( d.getPeopleAge( 8 ) );
        Dog g = new Dog( "bob", 3 );
        System.out.println( g.getName() );
        System.out.println( g.getPeopleAge( 5 ) );


    }
}
