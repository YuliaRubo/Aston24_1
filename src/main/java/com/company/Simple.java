package com.company;

public interface Simple <T>{
    public boolean add(T t);
    void delete(int index);
    T getElement(int i);
    void deleteAllElement();
    int getSize();
    void update(int index, T t);
     String toString();
}
