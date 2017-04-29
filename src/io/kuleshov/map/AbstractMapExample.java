package io.kuleshov.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public abstract class AbstractMapExample {
    protected static Map<String, Student> getStudents() {
        final Map<String, Student> students = new HashMap<String, Student>() {{
            put("12", new Student("12", "Slava"));
            put("11", new Student("13", "Gleb"));
        }};
//        for (String key : students.keySet())
//            students.compute(key, new BiFunction<String, Student, Student>() {
//                @Override
//                public Student apply(String s, Student student) {
//                    if (s.equals(student.getId())) return student;
//                    return new Student(s, student.getName());
//                }
//            });
        for (String key : students.keySet())
        students.compute(key, (k, student) ->
        k.equals(student.getId()) ? student : new Student(k, student.getName()));
        return students;
    }

}
