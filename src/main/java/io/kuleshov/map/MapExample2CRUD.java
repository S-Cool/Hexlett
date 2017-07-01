package io.kuleshov.map;

import java.util.Map;

public class MapExample2CRUD {
    public static void main(String[] args) {


        final Map<String, Student> students = AbstractMapExample.getStudents();
        if (students.containsKey("12")){
            final Student slava = students.get("12");
            System.out.println(slava);
            if (students.containsValue(slava)) {
                System.out.printf("Student %s is in the storage\n", slava.getName());
            }
        }
        final Student slava = students.get("12");
        students.remove("12");
        System.out.printf("After remove: %s\n", students);
        students.remove("11", slava);
        System.out.printf("After remove: %s\n", students);
    }
}