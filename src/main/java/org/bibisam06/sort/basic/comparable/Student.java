package org.bibisam06.sort.basic.comparable;

import java.util.*;


public class Student implements Comparable<Student>{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("비비", 22));
        students.add(new Student("철수", 20));
        students.add(new Student("민지", 25));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.getName() + " / " + s.getAge());
        }
    }
}
