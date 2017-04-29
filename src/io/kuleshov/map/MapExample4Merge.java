package io.kuleshov.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapExample4Merge {
    public static void main(String[] args) {
        final Map<String, Student> students = new HashMap<String, Student>() {{
            put("12", new Student("12", "Slava"));
            put("11", new Student("11", "Gleb"));
        }};
        final Map<String, Student> students2 = new HashMap<String, Student>() {{
            put("12", new Student("13", "Slava"));
            put("11", new Student("12", "Gleb"));
            put("13", new Student("13", "Oleh"));
        }};
//        for (Map.Entry<String, Student> e : students2.entrySet())
//            students.merge(e.getKey(), e.getValue(), new BiFunction<Student, Student, Student>() {
//
//                @Override
//                public Student apply(Student student, Student student2) {
//                    if (student.getId().equals(e.getKey())) return student;
//                    return student2;
//                }
//            });
        for (Map.Entry<String, Student> e : students2.entrySet())
        students.merge(e.getKey(), e.getValue(), (s1, s2) -> s1.getId().equals(e.getKey()) ? s1 : s2);
        System.out.println(students);
    }
}
