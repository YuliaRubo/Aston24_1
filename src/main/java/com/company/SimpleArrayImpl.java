package com.company;

import java.util.Arrays;

public class SimpleArrayImpl<T> implements Simple<T> {

    public static void main(String[] args) {
        /**
         *
         Пока не реализованно тестирвоание, проверку провожу таким образом
         */
        //Создание колелкции строк и добавление туда элеемнтов
        Simple<String> newArray = new SimpleArrayImpl<>();
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
         String y = newArray.toString();
        System.out.println(y);
        //Удаляем элемент с индексом 1 и остальные смещатся
        newArray.delete(1);
        System.out.println(newArray.getElement(1));
        //Получаем размер коллекции
        int r = newArray.getSize();
        System.out.println(r);
        //Удаляем все элементы из коллекции
        newArray.deleteAllElement();
        //Получаем размер после удаления всех элементов.
        int e = newArray.getSize();
        System.out.println(e);

    }
    private T[] arr;
    private int index = 0;

    public SimpleArrayImpl() {
        arr = (T[]) new Object[0];
    }

    /**
     *
     Добавление элемента в коллецию
     */
    @Override
    public boolean add(T t) {
        try {
            T[] temp = arr;
            arr = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, arr, 0, temp.length);
            arr[arr.length - 1] = t;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     *
     Удаление элемента из коллекции
     */
    @Override
    public void delete(int index) {
        try{
            T[] temp = arr;
            arr = (T[]) new Object[temp.length -1];
            System.arraycopy(temp, 0 , arr , 0, index );
            int count = temp.length-index-1;
            System.arraycopy(temp, index+1, arr, index, count );
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }
    /**
     *
    Получение элемента по индексу
     */
    @Override
    public T getElement(int i) {
        return arr[i];
    }
    /**
     *
     Удаление всех элементов коллекции
     */
    @Override
    public void deleteAllElement() {
        int size = arr.length;
        T[] temp = arr;
        arr = (T[]) new Object[0];
    }

    /**
     *
     Изменение данных по индексу
     */
    @Override
    public void update(int index, T t) {
        arr[index]=t;
    }
    /**
     *
     Размер нашей коллекции
     */
    @Override
    public int getSize() {
        return arr.length;

        /**
         *
         Вывод коллекции с помощью toString
         */
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    }


