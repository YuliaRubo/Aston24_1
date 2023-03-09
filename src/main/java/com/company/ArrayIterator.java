package com.company;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private  int index = 0;
    private T[] arr;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return index<arr.length;
    }

    @Override
    public T next() {
        return arr[index++];
    }
}
