package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
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
    public void delete() {
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        newArray.delete(1);
        int actual = 2;
        int expected = newArray.getSize();
        Assert.assertEquals(expected, actual);
        assertTrue(newArray.getSize()==2);

        String actual1 = newArray.getElement(0);
        String expected1 = "One";
        Assert.assertEquals(actual1, expected1);
        String actual2 = newArray.getElement(1);
        String expected2 = "Three";
        Assert.assertEquals(actual2, expected2);


    }

    @Test
    public void getElement() {
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        String actual = newArray.getElement(1);
        String  expected = "Two";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteAllElement() {
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        newArray.deleteAllElement();
        assertTrue(newArray.getSize()==0);
    }

    @Test
    public void update() {
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        newArray.update(2, "five");
        String actual = newArray.getElement(2);
        String expected = "five";
        Assert.assertEquals(expected, actual);
        assertTrue(newArray.getSize()==3);
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
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        newArray.insert(3, "Four");
        String actual = newArray.getElement(3);
        String expected = "Four";
        Assert.assertEquals(expected, actual);
    }
}