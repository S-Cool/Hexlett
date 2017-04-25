package io.kuleshov.map;

public class Student {

    private final String id;

    private final String name;


    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {return id; }
    public String getName() {return name; }

    @Override
    public String toString() { return id + ":" + name; }


}
