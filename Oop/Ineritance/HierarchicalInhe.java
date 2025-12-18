
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



class Circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class HierarchicalInhe {
    
}
