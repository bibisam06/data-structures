package org.bibisam06.sort.basic.comparator;

import org.bibisam06.sort.basic.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator3 {
    public static void main(String[] args) {
        //3. 람다형식으로 구현하기
        List<Student> list = new ArrayList<>();
        list.add(new Student("비비다람쥐", 23));
        list.add(new Student("상근임", 33));
        list.add(new Student("민지", 21));

        // 이름 길이로 정렬하기
        Collections.sort(list, (s1, s2) -> s1.getName().length() - s2.getName().length());

        for(Student s : list) {
            System.out.println(s.getName() + " / " + s.getAge());
        }
    }
}
