package net.idrok.Masalalar;

public class MyArrayList<E> {
    E[] massiv = (E[]) new Object[10];
    int size = 0;
    public void qoshish(E e) {
        if (size==massiv.length)
            ostirish();
        massiv[size++] = e;
    }

    public void qoshish(E e, int index) {
        if (index > size) {
            System.out.println(index + " bu index massiv o'lchamidan katta");
        } else {
             if(size==massiv.length)
                 ostirish();
            for (int i = size; i > index; i--) {
                massiv[i] = massiv[i - 1];
            }
            massiv[index] = e;
            size++;
        }
    }
    private void ostirish() {

            E [] massiv2= (E[])new Object[3*size/2];
            System.arraycopy(massiv,0,massiv2,0,size);
            massiv=massiv2;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(massiv[i]).append(',').append(' ');
        }
        return sb.toString();
    }

    public boolean boshTekshir() {
            return size == 0;

    }

    public void ochirish(int index) {
        if (index > size) {
            System.out.println(index + " bu indexda element mavjud emas");
        } else {
            for (int i = index; i < size - 1; i++) {
                massiv[i] = massiv[i+ 1];
            }
            massiv[--size]=null;

        }
    }

    public int indexTopish(E e) {
        for (int i = 0; i < size; i++) {
            if (massiv[i].equals(e)) {
                return i;
            }
         //   LinkedList ni qayta ishlash Node class
        }
        return -1;
    }

    public boolean elementTopish(String s) {
        return false;
    }
}
