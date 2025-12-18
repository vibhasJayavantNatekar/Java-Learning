
class Stud{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name , int age){
        System.out.println(name  + "  "+ age);
    }

}

public class FunOverLoading {
    
    public static void main(String[] args) {

        Stud s1 = new Stud();
        s1.name = "Vibhas";
        s1.age = 12;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);

        s1.printInfo(s1.name , s1.age);

        
    }
}
