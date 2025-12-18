package Oop.Ineritance;

class shape {
    public void area(){
        System.out.println("Displays area.");
    }
}

class Tringle extends shape {
    public void area(int i , int h){
        System.out.println(1/3*i*h);
    }
}

class EqulatorTringle extends Tringle{
    public void area(int l , int h){
        System.out.println(l/2*l*h);

    }
}
public class MultiLevel{
    public static void main(String[] args) {
        
    }
}   

