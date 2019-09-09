package com.playtika.javacourse.pizza;

public class FourCheesePizzaMakerMaker extends AbstractPizzaMaker {
    public FourCheesePizzaMakerMaker() {
        super("Четыре сыра");
    }

    @Override
    protected void wrapPizza() {
        System.out.println("Запаковать 4 сыра");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void putIngridients() {
        System.out.println("Кладем один сыр, два сыра, три сыра, четыре сыра");
    }
}
