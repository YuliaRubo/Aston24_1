package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleArrayImplTest {
    Simple<String> newArray = new SimpleArrayImpl<>();


    @Test
    public void add() {
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        assertTrue(newArray.getSize()==3);
    }

    @Test
    public void resize() {
    }

    @Test
    public void delete() {
        newArray.add("One");
        newArray.add("Two");
        newArray.delete(1);
        assertTrue(newArray.getSize()==1);
    }

    @Test
    public void getElement() {
        newArray.add("One");
        newArray.add("Two");
        String expected = newArray.getElement(1);
        String actual = "Two";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteAllElement() {
        newArray.add("One");
        newArray.add("Two");
        newArray.deleteAllElement();
        assertTrue(newArray.getSize()==0);
    }

    @Test
    public void update() {
    }

    @Test
    public void getSize() {
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        int expected = newArray.getSize();
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void insert() {
    }
}