package Oop;

class  pen {

    String color ; 
    String type ;
    public void write(){
        System.out.println("Writting something.");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class classes {

    public static void main(String[] args) {
        //object 
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        pen1.printColor();

        Student s1 = new Student();

        s1.name = "Vibhas";
        s1.age = 45;

        s1.printInfo();
    }
    
}
