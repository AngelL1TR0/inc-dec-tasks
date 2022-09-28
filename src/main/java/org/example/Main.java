package org.example;

public class Main {
    public static void main(String[] args) {


        Counter counter = new Counter(100);

        Thread increment = new Thread(new IncrementalTask(counter));
        Thread decrement = new Thread(new DecrementalTask(counter));

        increment.start();
        decrement.start();

        try {
            increment.join();
            decrement.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println(counter.getValue());
    }
}