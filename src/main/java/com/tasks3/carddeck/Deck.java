package com.tasks3.carddeck;

/*
Створіть класи для зберігання колоди з 36 карт (детальніше про колоду 36 карт https://en.wikipedia.org/wiki/Russian_playing_cards). Використовуйте класи заготовки

Просимо врахувати деякі особливості перевірки завдань:

Декларація package повинна залишатися незмінною (як у шаблоні), зверніть на це увагу вставляючи Ваш код у вікно перевірки.
Для перевірки використовуються (беруться до уваги) виключно методи з сигнатурою описаною в шаблоні.
Кількість та зміст полів та/або методів відмінних від наведених в шаблоні не обмежена.
В кожному класі повинен бути або конструктор за замовчанням або public безаргументний конструктор.
Не рекомендовано робити вивід на екран.
 */

public class Deck {

    public static Card[] cards;
    private static final int DECKVOLUME = 36;

    public Deck() {
        cards = new Card[DECKVOLUME];
        fillDeck();
    }

    private void fillDeck() {
        int n = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                cards[n] = new Card(Rank.values[j], Suit.values[i]);
                // System.out.println("N = " + n);
                // System.out.println(cards[n].getRank().toString() + cards[n].getSuit().toString());
                System.out.println(cards[n].getRank().getName() + " "+ cards[n].getSuit().getName());
                n++;
            }

        }
    }

        //Перемішує колоду у випадковому порядку
        public void shuffle() {

        }
        /* * Впорядкування колоди за мастями та значеннями
         * Порядок сотрування:
         * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
         * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
         * Наприклад
         * HEARTS Ace
         * HEARTS King
         * HEARTS Queen
         * HEARTS Jack
         * HEARTS 10
         * HEARTS 9
         * HEARTS 8
         * HEARTS 7
         * HEARTS 6
         * І так далі для DIAMONDS, CLUBS, SPADES */
        public void order() {
        }

        //Повертає true у випадку коли в колоді ще доступні карти
        public boolean hasNext() {
            return true;
        }

        //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
        //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
        //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
        public Card drawOne() {
            return null; //Just for test
        }


}
