package com.playtika.javacourse.collection;

import java.util.AbstractList;
import java.util.Arrays;

public class MyList<E> extends AbstractList<E> {

    private static final int DEFAULT_SIZE_OF_ARRAY = 8;
    private Object[] elements;
    private int size = 0;

    public MyList() {
        elements = new Object[8];
    }

    @Override
    public E get(int index) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Object e = elements[index];
        return (E) e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E set(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object temp = new Object();
        temp = elements[index];
        elements[index] = element;
        return (E) temp;
    }

    @Override
    public void add(int index, E element) {

        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, Math.round(elements.length * 1.5f));
        }

        int moved = size - index;
        if (moved > 0) {
            System.arraycopy(elements, index, elements, index+1, moved);
        }

        elements[index] = element;
        size++;
    }

    @Override
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object temp = elements[index];

        int moved = size - index;
        if (moved > 0) {
            System.arraycopy(elements, index+1, elements, index, moved);
        }

        elements[size-1] = null;
        size--;
        return (E) temp;
    }
}
