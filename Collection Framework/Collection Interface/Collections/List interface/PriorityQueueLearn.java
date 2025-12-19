import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueLearn {
    public static void main(String[] args) {

       // PriorityQueue<Integer> pq = new PriorityQueue<>(); behaves as min heap give priority small to element

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);
        System.out.println(pq.peek());



    }
}
