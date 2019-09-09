package com.playtika.javacourse.pizza;

public class PepperoniPizzaMakerMaker extends AbstractPizzaMaker {
    public PepperoniPizzaMakerMaker() {
        super("Пепперони");
    }

    @Override
    protected void wrapPizza() {
        System.out.println("Запаковать Пепперони");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void putIngridients() {
        System.out.println("Добавляем томаты, сыр, базилик, пепперони колбаса");
    }
}
