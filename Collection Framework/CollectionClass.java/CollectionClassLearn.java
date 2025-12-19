import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassLearn {

    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();

        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 20));

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);

        







    }
    
}
