package com.task3.fibonacci;
/*
* Використовуючи рекурсію, виведіть на екран задане по порядковому номеру число Фібоначі.
 */

import java.util.ArrayList;

public class Fibonacci {
    private ArrayList<Long> fibonaciList = new ArrayList<>();

    private long countNumber(int position) {

        if (position < 0) {
            return -1;
        } else if (position == 1) {
            return 0;
        } else if (position == 2) {
            return 1;
        } else if (position > 2) {
            fibonaciList.add((long) 0);
            fibonaciList.add((long) 1);
            for (int i = 2; i < position; i++) {
                fibonaciList.add(fibonaciList.get(i - 1) + fibonaciList.get(i - 2));
            }
        }
        return fibonaciList.get(position -1);
    }

    public long getNumber(int position){
        return countNumber(position);
    }
}
