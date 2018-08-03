package io.kuleshov.hackerrank;

public class C {
    public static A f(A a) {
        return a;
    }

    public static B f(B b) {
        return b;
    }

    public static void main(String[] args) {
        A a = f(new A());
        B b = f(new B());
        a.f(b);
        a = b;
        a.f(a);
    }
}

class A {
    void f(A a) {
        System.out.println("A");
    }

    void f(B b) {
        System.out.println("B");
    }
}

class B extends A {
    void f(A a) {
        System.out.println("C");
    }

    void f(B b) {
        System.out.println("D");
    }
}

