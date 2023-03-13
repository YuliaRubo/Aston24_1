package com.company;

public class Main {
    public static void main(String[] args) {
        com.company.SimpleArrayImpl<Object> objectSimpleArray = new com.company.SimpleArrayImpl<>();
        for (int i = 0; i < 1000; i++) {
            objectSimpleArray.insert(0, new Object());
        }
    }
}
