package com.playtika.javacourse.Stack;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<E>  extends AbstractCollection<E> implements Stack<E>{

    private static final int DEFAULT_SIZE_OF_ARRAY = 8;
    private Object[] elements;
    private int size = 0;

    public ArrayStack(){
        elements = new Object[DEFAULT_SIZE_OF_ARRAY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(E element) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, Math.round(elements.length * 1.5f));
        }
        // add new element to array and chage size
        elements[size] = element;
        size++;
    }

    @Override
    public E pop() {
        if (size < 1) {
            return null;
        }
        // delete the last element in array and change size
        Object temp = elements[size-1];
        elements[size-1] = null;
        size --;
        return (E) temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    class StackIterator implements Iterator<E> {
        private int currentIndex = size - 1;

        @Override
        public boolean hasNext() {
            return (currentIndex >= 0);
        }

        @Override
        public E next() throws NoSuchElementException{
            if (!hasNext()){
                throw new NoSuchElementException("There is no element");
            }
            return (E) elements[currentIndex--];
        }
    }
}
