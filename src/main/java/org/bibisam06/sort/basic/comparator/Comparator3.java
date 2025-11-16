package org.bibisam06.sort.basic.comparator;

import org.bibisam06.sort.basic.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator3 {
    public static void main(String[] args) {
        //3. 람다형식으로 구현하기
        List<Student> list = new ArrayList<>();
        list.add(new Student("비비", 23));
        list.add(new Student("상근", 33));
        list.add(new Student("민지", 21));

        Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));

        for(Student s : list) {
            System.out.println(s.getName() + " / " + s.getAge());
        }
    }
}
