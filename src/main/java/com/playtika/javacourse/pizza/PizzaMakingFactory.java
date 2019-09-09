package com.playtika.javacourse.pizza;

public class PizzaMakingFactory {
    public AbstractPizzaMaker getPizzaMaker(Button button) {
        switch (button) {
            case A:
                return new CarbonaraPizzaMakerMaker();
            case B:
                return new PepperoniPizzaMakerMaker();
            case C:
                return new FourCheesePizzaMakerMaker();
            case D:
                return new PoloPizzaMakerMaker();
            default:
                return null;
        }
    }
}
