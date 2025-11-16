package org.bibisam06.priorityqueue;

import org.bibisam06.sort.basic.comparable.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue3 {
    public static void main(String[] args) {
        //우선순위 큐 - 기준에 따라 정렬하기 Comparator= 연습

        List<Student> list = new ArrayList<>();
        list.add(new Student("비비", 23));
        list.add(new Student("상근", 33));
        list.add(new Student("민지", 21));

        PriorityQueue<Student> pq = new PriorityQueue<>(
                (a, b) -> a.getAge() - b.getAge()
        );

        for (Student s : list) {
            pq.add(s);
        }

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.getName() + " / " + s.getAge());
        }
    }
}
