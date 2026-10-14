package VO_Muster_Aufgabe_02;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        
    int grenze = 100;

    Thread th0 = new Thread(() -> druckeZahlenMitStream(grenze, i -> i % 2 == 0));
    Thread th1 = new Thread(() -> druckeZahlenMitStream(grenze, i -> i % 2 != 0));

    th0.start();
    th1.start();
}
public static void druckeZahlenMitStream(int grenze, IntPredicate filter){
    String threadName = Thread.currentThread().getName();
    IntStream.rangeClosed(0, grenze)
                .filter(filter)
                .forEach(i -> System.out.println(threadName + ": " + i));
    }
}
