package com.tasks3.carddeck;

public class TestTask3 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        System.out.println(Rank.values[Rank.values.length - 1].getName());
    }
}
