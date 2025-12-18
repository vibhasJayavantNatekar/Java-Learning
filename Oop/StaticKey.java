class Student {
    String name;
    static String school;

    public static void changeSchool (){
        school = "Regal Collage";
    }
}

public class StaticKey {

    public static void main(String[] args) {
        Student.school = "Regal";
        Student s1 = new Student();
        s1.name = "Vibhas";
        System.out.println(s1.school);
    }
    
}
