import java.util.*;

public class DemoQueue {
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("Remove element : "+q.poll());
        System.out.println("remove ,element : " +q.peek());
       // System.out.println(q);

       System.out.println(q.peek());



       Deque<Integer> dq=new ArrayDeque<>();
       dq.addFirst(150);
       dq.addFirst(100);
       dq.addLast(200);
       dq.addLast(500);
       System.out.println(dq);
       System.out.println(dq.pollFirst());
       System.out.println(dq);
       System.out.println(dq.pollLast());
       System.out.println(dq);
//peek operations
        System.out.println(dq.peekFirst()+"\n"+dq.peekLast());

        Deque<String> dq1=new ArrayDeque<>();
        dq1.addFirst("Dinesh");
        dq1.add("Kannaiah");
        dq1.addLast("Abhi");
        dq1.add("raji");
        System.out.println(dq1);

//Priority Queue Min Heap And Max-Heap
//PriorityQueue does not follow FIFO .it always dequeue the smallest element first (min Heap).
        System.out.println("Priority Queue");
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(100);
        pq.offer(200);
        pq.offer(300);
        pq.offer(400);
        System.out.println("Queue is"+pq);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
