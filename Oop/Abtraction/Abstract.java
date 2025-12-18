
abstract class Animal {
    abstract void walk ();
    Animal(){
        System.out.println("You are creating an Animal.");
    }
    public void eat(){
        System.out.println("Animal eats");
    }

}

class Horse extends Animal{
    Horse(){
        System.out.println("You are created horse.");
    }
    public void walk(){
        System.out.println("Walk on 4 Legs.");
    }
}



class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs.");
    }
}


public class Abstract {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

    }
    
}
