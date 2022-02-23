package com.company;

public interface Printable<T> extends Comparable {
    void print(T t);
}
