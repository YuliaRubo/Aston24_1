package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleArrayImplTest {

    Simple<String> newArray = new SimpleArrayImpl<>();


    @Test
    @Before
    public void add() {
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        assertTrue(newArray.getSize()==3);
    }


    @Test
    public void delete() {
        newArray.delete(1);
        assertTrue(newArray.getSize()==2);
    }

    @Test
    public void getElement() {
        String expected = newArray.getElement(1);
        String actual = "Two";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteAllElement() {
        newArray.deleteAllElement();
        assertTrue(newArray.getSize()==0);
    }

    @Test
    public void update() {
        newArray.update(2, "five");
        String expected = newArray.getElement(2);
        String actual = "five";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSize() {
        int expected = newArray.getSize();
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void insert() {
        newArray.insert(3, "Four");
        String expected = newArray.getElement(3);
        String actual = "Four";
        Assert.assertEquals(expected, actual);
    }
}