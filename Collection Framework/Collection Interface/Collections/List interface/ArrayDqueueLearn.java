import java.util.ArrayDeque;

public class ArrayDqueueLearn {
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer>  aq = new ArrayDeque<>();

        aq.offer(12);
        aq.offerFirst(45);
        aq.offerLast(40);

        System.out.println(aq);

        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());

        System.out.println(aq.poll());
        System.out.println("aq.poll()" + aq);

        System.out.println(aq.pollFirst());
        System.out.println("aq.pollFirst()" + aq);

        System.out.println(aq.pollLast());
        System.out.println("aq.pollLast()" + aq);





    }
}
