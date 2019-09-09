package com.playtika.javacourse.pizza;

public class PoloPizzaMakerMaker extends AbstractPizzaMaker {
    public PoloPizzaMakerMaker() {
        super("Поло");
    }

    @Override
    protected void wrapPizza() {
        System.out.println("Запаковать Поло ");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngridients() {
        System.out.println("че-то положили");
    }
}
