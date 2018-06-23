package io.kuleshov.InnerClass;

public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }
    /* методы */
    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}
