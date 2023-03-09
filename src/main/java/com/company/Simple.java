package com.company;

public interface Simple <T>{
    void add(T t);
    void delete(int index);
    T getElement(int i);
    void deleteAllElement();
    int getSize();
    void update(int index, T t);
    String toString();
    void insert(int i, T t);

}
