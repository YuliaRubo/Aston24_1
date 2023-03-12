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
        int actual = 2;
        int expected = newArray.getSize();
        Assert.assertEquals(expected, actual);
        assertTrue(newArray.getSize()==2);

    }

    @Test
    public void getElement() {
        String actual = newArray.getElement(1);
        String  expected = "Two";
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
        String actual = newArray.getElement(2);
        String expected = "five";
        Assert.assertEquals(expected, actual);
        assertTrue(newArray.getSize()==3);
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
        String actual = newArray.getElement(3);
        String expected = "Four";
        Assert.assertEquals(expected, actual);
    }
}