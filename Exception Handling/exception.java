
public class exception {
     public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello Wolrd");

        // try{
        // int result = 5/0;

        // System.out.println(a[8]);

        
        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("tries to access out of bond exception .");
        // }catch(ArithmeticException e){
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println(e);


        // }

        try{
        int result = 5/0;

        System.out.println(a[8]);

        //You handle multiple  exceptions

        // }catch(ArrayIndexOutOfBoundsException  | ArithmeticException  | NullPointerException e){
        //     System.out.println("Handling the exception .");
        // }
      
        //You can handle any type of exception like this.
        }catch(Exception e){
              System.out.println("All exception Handle.");
        }




     }
}
