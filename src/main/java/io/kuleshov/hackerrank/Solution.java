package io.kuleshov.hackerrank;

public enum Solution {
    MERCEDES(10), TOYOTA(7), VOLVO;
    private int freeCabs; // поле класса перечисления

    Solution() { // конструктор класса перечисления
    }

    Solution(int cabs) { // конструктор класса перечисления
        freeCabs = cabs;
    }

    public int getFreeCabs() {
        return freeCabs;
    }

    public void setFreeCabs(int cabs) {
        freeCabs = cabs;
    }

    @Override
    public String toString() {
        return String.format("%s : free cabs = %d", name(), freeCabs);
    }
}



