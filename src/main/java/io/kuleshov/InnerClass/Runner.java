package io.kuleshov.InnerClass;

public class Runner {

    public static void main(String[] args) {
        TeacherLogic tl = new TeacherLogic();
        tl.excludeProcess(777, "Олейников");
        tl.excludeProcess(6, "Олейников");
    }
}