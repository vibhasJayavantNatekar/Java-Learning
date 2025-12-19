import java.util.HashSet;
import java.util.Set;

public class HashSetLearn {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();

        set.add(32);
        set.add(40);
        set.add(74);
        set.add(85);

        set.add(32); //This will not allowed Duplicates not allow

        System.out.println(set);

        set.remove(40);

        System.out.println(set);

        System.out.println(set.contains(85));

        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);

    }
}
