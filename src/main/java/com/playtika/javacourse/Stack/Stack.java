package com.playtika.javacourse.Stack;

import java.util.Collection;

public interface Stack<E> extends Collection<E> {
    void push(E element);

    E pop();
}
