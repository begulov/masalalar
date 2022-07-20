package net.idrok.Masalalar;

import java.util.NoSuchElementException;

public class MyLinkedList <E>{
  E[]massiv= (E[]) new Object[10];
    static int  size =0;

    public MyLinkedList() {
    }
    public static int olcham() {
        return size;
    }
    public E getFirstElement() {
        if (massiv[0]==null) {
            throw new NoSuchElementException();
        }
        return massiv[0];
    }
    public void qoshish(E e) {
        massiv[size++]=e;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (E e : massiv) {
            sb.append(e).append(',').append(' ');
        }
        return sb.toString();
    }
}
