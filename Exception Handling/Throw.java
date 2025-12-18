import java.util.Scanner;
public class Throw{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");

        try{
            int age = sc.nextInt();
            if(age > 100 ){
                throw new Myexception();
            }
        }catch(Exception e){
            System.out.println(e);
        }   

    }
   
}

class Myexception extends Exception{

}
