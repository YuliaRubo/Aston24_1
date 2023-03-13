package com.company;

import java.util.Arrays;

public class SimpleArrayImpl<T> implements Simple<T> {


    /**
     * Создаем массив с 10 пустыми ячейками
     */
    private T[] arr = (T[]) new Object[10];
    private int index = 0;

    public SimpleArrayImpl(int t) {
        arr = (T[]) new Object[t];
    }

    public SimpleArrayImpl() {
    }

    /**
     * Добавление элемента в коллецию, изначально в коллекции 10 элементов,
     * если добавляем больше 10 элементов, то размер увеличивется в 2 раза.
     */
    @Override
    public void add(T t) {
        if (index == arr.length) {
            resize();
        }
        arr[index] = t;
        index += 1;
    }

    public void resize() {
        T[] newArr = (T[]) new Object[arr.length*2];
        for (int j = 0; j < arr.length; j++) {
            newArr[j] = arr[j];
        }
        arr = newArr;
    }

    /**
     * Удаление элемента из коллекции
     */
    @Override
    public void delete(int i) {
        for (int j = i; j < index - 1; j++) {
            arr[j] = arr[j + 1];
        }
        index--;
    }

    /**
     * Получение элемента по индексу
     */
    @Override
    public T getElement(int i) {
        return arr[i];
    }

    /**
     * Удаление всех элементов коллекции
     */
    @Override
    public void deleteAllElement() {
            for (int i = index-1; i >=0 ; i--) {
                delete(i);
            }
        }


    /**
     * Изменение данных по индексу
     */
    @Override
    public void update(int index, T t) {
        arr[index] = t;
    }

    /**
     * Размер нашей коллекции
     */
    @Override
    public int getSize() {
        return index;

        /**
         *
         Вывод коллекции с помощью toString
         */
    }

    @Override
    public String toString() {
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

    /**
     * Добавление элемента по индексу
     */
    @Override
    public void insert(int i, T t) {
        if (index == arr.length) {
            resize();
        }
        T prev = arr[i];
        arr[i] = t;
        for (int j = i + 1; j <= index; j++) {
            T curr = arr[j];
            arr[j] = prev;
            prev = curr;
        }
        index += 1;
    }

    /**
     *
     Добавление элемента в коллецию, создается новый массив
     и туда копируются все эелементы коллекции
     и дальше добавляется в конец новый элемент
     */
//    @Override
//    public boolean add(T t) {
//        try {
//            T[] temp = arr;
//            arr = (T[]) new Object[temp.length + 1];
//            System.arraycopy(temp, 0, arr, 0, temp.length);
//            arr[arr.length - 1] = t;
//            return true;
//        } catch (ClassCastException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }
    /**
     *
     Удаление элемента из коллекции с помощью создания
     нового массива и копирование всех эелементов,
     кроме того, который удалили
     */
    //    @Override
//    public void delete(int index) {
//        try{
//            T[] temp = arr;
//            arr = (T[]) new Object[temp.length -1];
//            System.arraycopy(temp, 0 , arr , 0, index );
//            int count = temp.length-index-1;
//            System.arraycopy(temp, index+1, arr, index, count );
//        }catch (ClassCastException ex){
//            ex.printStackTrace();
//        }
////    }

}


