//  import  java.util.LinkedList;
import java.util.Queue;


public class LinkedList {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new java.util.LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());//Remove from front

        System.out.println(queue);

        System.out.println(queue.peek());

        




    }
}
