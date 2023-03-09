package com.company;

import static org.junit.Assert.*;

public class SimpleArrayImplTest {
    Simple<String> newSimple = new SimpleArrayImpl<>();

    @org.junit.Test
    public void add() {
        newSimple.add("First");
        newSimple.add("Second");
        newSimple.add("third");
    }

    @org.junit.Test
    public void delete() {

    }

    @org.junit.Test
    public void getElement() {
    newSimple.getElement(2);


    }

    @org.junit.Test
    public void deleteAllElement() {
    }

    @org.junit.Test
    public void update() {
    }

    @org.junit.Test
    public void getSize() {

    }
}