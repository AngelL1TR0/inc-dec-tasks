package org.example;

public class Counter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized  void increments(){
        value++;
    }

    public synchronized  void decrements(){
        value--;
    }
}
