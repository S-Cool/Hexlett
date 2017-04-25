package io.kuleshov.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapExample3Iteration {
    public static void main(String[] args) {
        final Map<String, Student> students = AbstractMapExample.getStudents();

        final Set<String> keys = students.keySet();
        System.out.printf("Keys in the map: %s\n", keys);

        final Collection<Student> studentsValues = students.values();
        System.out.printf("Students in the map: %s\n", studentsValues);

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.printf("Entry: %s\n", entry);
        }
    }
}
