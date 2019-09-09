package com.playtika.javacourse.pizza;

public abstract class AbstractPizzaMaker {
    private final String pizzaName;

    protected AbstractPizzaMaker(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String makePizza() {
        takeBlank();
        putIngridients();
        bakePizza();
        slicePizza();
        wrapPizza();
        return pizzaName;
    }

    protected abstract void wrapPizza();

    protected abstract void bakePizza();

    protected abstract void putIngridients();

    private void takeBlank() {
        System.out.println("Берем заготовку");
    }

    private void slicePizza() {
        System.out.println("Разрезать пиццу на 6 кусочков");
    }
}
