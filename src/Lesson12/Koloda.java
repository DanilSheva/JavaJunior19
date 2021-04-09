package Lesson12;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
    private Card[] cards = new Card[52];

    public Koloda() {
        cards[0] = new Card("Двойка трефа", 2);
        cards[1] = new Card("Двойка черви", 2);
        cards[2] = new Card("Двойка бубны", 2);
        cards[3] = new Card("Двойка пики", 2);

        cards[4] = new Card("Тройка трефа", 3);
        cards[5] = new Card("Тройка черви", 3);
        cards[6] = new Card("Тройка бубны", 3);
        cards[7] = new Card("Тройка пики", 3);

        cards[8] = new Card("Четверка трефа", 4);
        cards[9] = new Card("Четверка черви", 4);
        cards[10] = new Card("Четверка бубны", 4);
        cards[11] = new Card("Четверка пики", 4);

        cards[12] = new Card("Пятерка трефа", 5);
        cards[13] = new Card("Пятерка черви", 5);
        cards[14] = new Card("Пятерка бубны", 5);
        cards[15] = new Card("Пятерка пики", 5);

        cards[16] = new Card("Шестерка трефа", 6);
        cards[17] = new Card("Шестерка черви", 6);
        cards[18] = new Card("Шестерка бубны", 6);
        cards[19] = new Card("Шестерка пики", 6);

        cards[20] = new Card("Семерка трефа", 7);
        cards[21] = new Card("Семерка черви", 7);
        cards[22] = new Card("Семерка бубны",  7);
        cards[23] = new Card("Семерка пики", 7);

        cards[24] = new Card("Восьмерка трефа", 8);
        cards[25] = new Card("Восьмерка черви", 8);
        cards[26] = new Card("Восьмерка бубны", 8);
        cards[27] = new Card("Восьмерка пики", 8);

        cards[28] = new Card("Девятка трефа", 9);
        cards[29] = new Card("Девятка черви", 9);
        cards[30] = new Card("Девятка бубны", 9);
        cards[31] = new Card("Девятка пики", 9);

        cards[32] = new Card("Десять трефа", 10);
        cards[33] = new Card("Десять  черви", 10);
        cards[34] = new Card("Десять  бубны", 10);
        cards[35] = new Card("Десять  пики", 10);

        cards[36] = new Card("Валет трефа", 2);
        cards[37] = new Card("Валет черви", 2);
        cards[38] = new Card("Валет бубны", 2);
        cards[39] = new Card("Валет пики", 2);

        cards[40] = new Card("Дама трефа", 3);
        cards[41] = new Card("Дама черви", 3);
        cards[42] = new Card("Дама бубны", 3);
        cards[43] = new Card("Дама пики", 3);

        cards[44] = new Card("Король трефа", 4);
        cards[45] = new Card("Король черви", 4);
        cards[46] = new Card("Король бубны", 4);
        cards[47] = new Card("Король пики", 4);

        cards[48] = new Card("Туз трефа", 11);
        cards[49] = new Card("Туз черви", 11);
        cards[50] = new Card("Туз бубны", 11);
        cards[51] = new Card("Туз пики", 11);


    }
    public Card randomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0,52);
        return cards [randomNum];
    }
}
