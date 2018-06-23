package io.kuleshov.InnerClass;

public abstract class AbstractTeacher {
    private int id;
    public AbstractTeacher(int id) {
        this.id = id;
    }
    /* методы */
    public abstract boolean excludeStudent(String name);
}
