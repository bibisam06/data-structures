package org.bibisam06.sort.basic.comparator;

import org.bibisam06.sort.basic.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("비비", 23));
        list.add(new Student("상근", 33));
        list.add(new Student("민지", 21));

        Collections.sort(list, new MyComparator());

        for (Student s : list) {
            System.out.println(s.getName() + " / " + s.getAge());
        }
    }
}
