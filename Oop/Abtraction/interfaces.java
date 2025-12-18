interface Animal{
    int eyes =2;
    void walk();
}

interface Herbivore{

}

class horse implements Animal , Herbivore{
   public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class interfaces {
    
    public static void main(String[] args) {
        
    }
}
