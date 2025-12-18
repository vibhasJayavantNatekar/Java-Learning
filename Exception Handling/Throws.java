
public class Throws {

    public static void main(String args[]){
       int a[] = new int[5];

       try{
        getNumberFromArray(a);

       }catch(Exception e){
        System.out.println("Catched the excetion." +  e.getMessage());
        
       }

       

    }

     static int getNumberFromArray(int a[] )throws ArithmeticException{
            return a[8];
        }
    
}
