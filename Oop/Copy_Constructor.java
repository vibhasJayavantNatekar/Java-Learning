class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


    //Copy constructor

    Student(Student s2){
        this.age =s2.age;
        this.name = s2.name;
    }
    Student(){
        
    }
}

public class Copy_Constructor {
public static void main(String[] args) {
    

    
        Student s1 = new Student();
        s1.name = "Vibhas";
        s1.age= 12;

        s1.printInfo();

        Student s2 = new Student(s1);
       s2.printInfo();    
}
}
