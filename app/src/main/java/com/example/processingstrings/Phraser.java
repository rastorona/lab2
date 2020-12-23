package com.example.processingstrings;

public class Phraser {
    public static String PhraserGen() {
        String[] wordListOne = {"круглосуточный", "трех-звенный",
                "30-футовьй", "взаимный", "обоюдный выигрыш", "фронтэнд",
                "на основе веб-технологий", "проникащий", "умный", "динамичный"};

        String[] wordListTwo = {"уполномоченный", "трудный",
                "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный",
                "целесообразный", "общий", "совместный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rl = (int) (Math.random() * oneLength) ;
        int r2 = (int) (Math.random() * twoLength) ;
        int r3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rl] + " " +
                wordListTwo[r2] + " " + wordListThree[r3];
        return phrase;


    }
}

