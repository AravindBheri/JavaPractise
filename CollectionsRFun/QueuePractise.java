package CollectionsRFun;

import java.util.PriorityQueue;

public class QueuePractise {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue  = new PriorityQueue<Integer>();

        for(int i = 10; i > 0; i--) {
            queue.add(i);
        }
        
        System.out.println("Queue list is: " + queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println("Queue list after poll is : " + queue);
        System.out.println("Queue head after poll is : " + queue.peek());
    }
}