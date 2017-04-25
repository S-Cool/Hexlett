package io.kuleshov.map;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMapExample {
    protected static Map<String, Student> getStudents() {
        return new HashMap<String, Student>() {{
            put("12", new Student("12", "Slava"));
            put("11", new Student("12", "Gleb"));
        }};
    }
}
