package com.company;

public class SecondEngine<T> implements Printable<T>{
    public final String sound = "vrrrrrrrrrr";
    @Override
    public String toString() {
        return sound;
    }

    @Override
    public void print(T t) {

    }
}
