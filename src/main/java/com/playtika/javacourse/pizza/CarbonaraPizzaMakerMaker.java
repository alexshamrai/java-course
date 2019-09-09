package com.playtika.javacourse.pizza;

public class CarbonaraPizzaMakerMaker extends AbstractPizzaMaker {
    public CarbonaraPizzaMakerMaker() {
        super("Карбонара");
    }

    @Override
    protected void wrapPizza() {
        System.out.println("Запакоать Карбонара");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngridients() {
        System.out.println("Добавляем сыр, колбасу, соус, яйцо, томаты");
    }
}
