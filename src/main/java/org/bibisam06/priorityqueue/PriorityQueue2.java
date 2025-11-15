package org.bibisam06.priorityqueue;

import java.util.*;

public class PriorityQueue2 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        System.out.println(pq);
    }
}
