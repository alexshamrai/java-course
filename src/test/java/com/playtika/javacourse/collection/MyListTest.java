package com.playtika.javacourse.collection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyListTest {

    private MyList<String> myList = new MyList<>();

    @Test
    public void shouldReturnElementByIndex() {
        myList.add("Hi");

        String result = myList.get(0);

        assertEquals("Hi", result);
    }

    @Test
    public void shouldReturnSize() {
       myList.add("");

       assertEquals(1, myList.size());
    }

    @Test
    public void shouldSetElementByIndex() {
        myList.add("");
        myList.add("");

        String beforeValue = myList.set(1, "test");
        assertEquals("", beforeValue);

        String newValue = myList.get(1);
        assertEquals("test", newValue);
    }

    @Test
    public void shouldAddElementByIndex() {
        myList.add("");
        myList.add("");

        myList.add(1, "test");
        assertEquals(3, myList.size());
        assertEquals("test", myList.get(1));
        assertEquals("", myList.get(2));
    }

    @Test
    public void shouldRemovelementByIndex() {
        myList.add("1");
        myList.add("2");
        myList.add("3");

        assertEquals("1", myList.remove(0));
        assertEquals(2, myList.size());
        assertEquals("2", myList.get(0));
    }

    @Test
    public void shouldAdd100ElementsByIndex() {
        for (int i = 0 ; i < 100; i++) {
            myList.add("test");
        }
        assertEquals(100, myList.size());

        myList.add(1, "hi");
        assertEquals("hi", myList.get(1));
    }

}
