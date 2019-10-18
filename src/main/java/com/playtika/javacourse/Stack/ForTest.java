package com.playtika.javacourse.Stack;

public class ForTest {
    public static void main(String[] args) {
        ArrayStack<String> testStack = new ArrayStack<>();
        System.out.println("Size: " + testStack.size());
        System.out.println(testStack);
        System.out.println(testStack.pop());

        for(int i = 0; i < 21; i++) {
            testStack.push("test" + i);
        }

        System.out.println("Size: " + testStack.size());
        System.out.println(testStack);

        System.out.println(testStack.pop());
        System.out.println("Size: " + testStack.size());
        System.out.println(testStack);

        for(String i:testStack) {
            System.out.println(i);
        }
    }
}
