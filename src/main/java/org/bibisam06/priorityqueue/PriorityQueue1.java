package org.bibisam06.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args){
        //우선순위큐 기본 1
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
