package com.playtika.javacourse.pizza;

public class PizzaAutomat {
    public static void main(String[] args) {
        PizzaMakingFactory factory = new PizzaMakingFactory();
        String pizza = factory.getPizzaMaker(Button.A).makePizza();
        pizza = factory.getPizzaMaker(Button.B).makePizza();
        pizza = factory.getPizzaMaker(Button.C).makePizza();
        pizza = factory.getPizzaMaker(Button.D).makePizza();
    }
}
