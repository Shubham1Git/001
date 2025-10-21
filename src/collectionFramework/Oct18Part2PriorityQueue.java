package collectionFramework;

import java.util.PriorityQueue;

public class Oct18Part2PriorityQueue {
    public static void main(String[] args) {
        // Queue
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1"); // Offer = add
        pq.offer("8");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek()); // First
        System.out.println(pq.poll()); // Remove the first
        System.out.println(pq);
    }
}