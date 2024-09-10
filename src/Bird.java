public class Bird {


    // attributes or data fields
    private String name;
    private int size;

    //constructors, not really methods, no manually way to call a construtor.
    public Bird(String n, int s) {
        this.name = n;
        size = s;

    }

    public Bird(){
        name = "something";
        size = 1;
    }

    public Bird(String n){//name only
        name = n;
        size = 1;
    }

    public Bird(int s){
        name = "something";
        size = s;
    }


    //getters and setters
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public void setName(String n){
        name = n;
    }
    public void setSize(int s){
        size = s;
    }




    //return methods
    public int getage() {
        return 8;
    }
    //public methods
    public void move() {
        System.out.println("fly");
    }

    public void speak() {// do it , do the job metho
        System.out.println("Peep-Peep");


    }


}
