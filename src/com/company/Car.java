package com.company;

public class Car<T extends Comparable,E extends Printable> {
    private String name;
    private T engine;
    private E id;

    public <V>Car(String name, T engine, V qwe) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public T getEngine() {
        return engine;
    }
    public static <F extends Comparable> void plus(F first, F second){
        System.out.println(first + " compare to " + second + " = " + first.compareTo(second));
    }
}
