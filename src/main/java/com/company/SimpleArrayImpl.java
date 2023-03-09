package com.company;

import java.util.Arrays;

public class SimpleArrayImpl<T> implements Simple<T> {

    public static void main(String[] args) {
        /**
         *
         Пока не реализованно тестирвоание, проверку провожу таким образом
         */
        //Создание колелкции строк и добавление туда элементов
        Simple<String> newArray = new SimpleArrayImpl<>();
        newArray.add("One");
        newArray.add("Two");
        newArray.add("Three");
        //получение элемента из коллекции по индексу.
        String s = newArray.getElement(1);
        System.out.println(s);
        //добавление элемента в коллекцию по индексу.
        newArray.insert(2, "Cool");
        //Вывод коллекции после добавления элементов
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
    /**
     *
     Создаем массив с 10 пустыми ячейками
     */
    private T[] arr = (T[]) new Object[10];
    private int index =0;

    public SimpleArrayImpl(int t){
        arr = (T[]) new Object[t];
    }

    public SimpleArrayImpl() {
    }

    /**
     *
     Добавление элемента в коллецию, изначально в коллекции 10 элементов,
     если добавляем больше 10 элементов, то размер увеличивется в 2 раза.
     */
    @Override
    public void add(T t) {
        if(index ==arr.length){
            resize(arr.length*2);
        }
        arr[index]=t;
        index+=1;
    }

    public void resize(int i){
        T[]newArr = (T[]) new Object[i];
        for (int j = 0; j < i; j++) {
            newArr[i]=arr[i];
        }
         arr =newArr;
    }

    /**
     *
     Удаление элемента из коллекции
     */
     @Override
     public void delete(int i) {
         for(int j=i; j<index-1; j++){
             arr[j]=arr[j+1];
         }
         index--;
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
        return index;

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
    /**
     *
     Добавление элемента по индексу
     */
    @Override
    public void insert(int i, T t) {
        if(index==arr.length){
            resize(arr.length*2);
        }
        T prev = arr[i];
        arr[i]=t;
        for (int j = i+1; j <= index; j++) {
            T curr = arr[j];
            arr[j] = prev;
            prev = curr;
        }
        index+=1;
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


