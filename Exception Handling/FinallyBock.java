
public class FinallyBock {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello , World!");
        try{
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("Exception Handled>");
            //Finally will run always
        }finally{
            System.out.println("I will run always.");
        }

        try{
            System.out.println(a[3]);
     
            //Finally will run always
        }finally{
            System.out.println("I will run always.");
        }
    }
}