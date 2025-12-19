import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String , Integer > numbers = new HashMap<>();


        //Key must me quique
        numbers.put("One", 1);
        numbers.put("Two",2);
        numbers.put("Three", 3);

        System.out.println(numbers);

        //ITerator
        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
    
}
