package io.kuleshov.map;

import java.util.Map;

public class MapExample1Clear extends AbstractMapExample {

    public static void main(String[] args) {
        final Map<String, Student> studentMap = AbstractMapExample.getStudents();
        System.out.println(studentMap);
        studentMap.clear();
        System.out.println(studentMap);
    }
}
