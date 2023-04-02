package alishev.beginner;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "зависший", "трехзвенный", "межрегиональный", "вещественный",
                "передвижной", "длинный и толстый", "300-метровый", "идеальный", "импортный", "запредельный",
                "взаимный", "сфальсифицированный", "нанотехнологичный", "бухгалтерский", "обремененный",
                "классический", "проникающий", "умный", "раскрытый полностью", "разведенный", "засевший", "природный",
                "ответственный", "бесперспективный", "динамичный", "угнетенный", "самый маленький", "прямоходящий",
                "гигантский", "сферический", "природный", "потерпевший", "природоохранный", "параллельный",
                "внезапный", "здоровый", "охраняемый", "безукоризненный", "неукоснительный", "продуманный",
                "подходящий", "неутомимый", "нецелесообразный", "беспрепятственный", "своевременный",
                "развернутый"};
        String[] wordListTwo = {"уполномоченный", "трудный", "ипотечный", "непродуманный", "социалистический",
                "развитой", "теневой", "сервисный", "солнечный", "кривошипно-шатунный", "завораживающий",
                "ориентированный", "центральный", "распределенный", "кластеризованный", "фирменный",
                "позиционированный", "сетевой", "расфокусированный", "использованный с выгодой", "программный",
                "выровненный", "нацеленный", "общий", "совместный", "подвешенный", "ускоренный", "представительский",
                "ненастоящий", "непрерывный", "материально ответственный", "навесной", "выжатый", "радостный",
                "несоизмеримо большой", "стабилизированный", "подвернутый", "конкурентоспособный", "вечный",
                "сельскохозяйственный", "актуальный", "корпоративный", "инстинктивный", "экономический",
                "трансатлантический"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "генетический крах", "поток сознания", "чистый продукт",
                "генератор идей", "идеалист", "выход из положения", "тип структуры", "перелом в сознании", "ретранслятор",
                "товаровед", "талант", "разовый подход", "атеросклероз", "уровень завоеванного внимания", "портал",
                "период времени", "обзор", "фронтэнд", "образец", "пункт следования", "кармический символ",
                "нестандартный ум", "метод критического пути", "оголтелый расизм", "выстрел в упор", "внезапный прорыв",
                "творческий процесс", "обоюдный выигрыш", "механизм", "подоходный налог", "каталог",
                "метод построения", "несчастный случай", "факт своевременной уплаты налогов", "качественный переход",
                "факт построения коммунизма", "компьютерный вирус", "акт угрозы безопасности", "адреналин",
                "акт слияния", "субъективный подход", "объективный метод", "защитный механизм", "налоговый учет"};
        String[] wordListFour = {"с продувкой", "под защитой", "в верхней части", "с левой стороны",
                "навеянный воспоминаниями", "под эгидой службы безопасности", "под угрозой убийством", "под следствием",
                "под прикрытием", "страдая от зноя", "не приходя в себя", "с пострадавшими", "впритык",
                "в приподнятом настроении", "несмотря на обстоятельства", "со спасением", "на выходе",
                "в неподходящее время", "с первого раза", "начиная со входа", "без сомнений", "как правило",
                "на внешней подвеске", "не считая расходов", "на основе веб-технологий", "не оглядываясь назад",
                "глядя в светлое будущее", "навзирая на лица", "не задумываясь о последствиях",
                "с привлечением спецподразделений", "по определению", "вразрез с общественным мнением",
                "не дожидаясь результата"};

        int oneLenth = wordListOne.length;
        int twoLenth = wordListTwo.length;
        int threeLenth = wordListThree.length;
        int fourLenth = wordListFour.length;

        int rand1 = (int) (Math.random() * oneLenth);
        int rand2 = (int) (Math.random() * twoLenth);
        int rand3 = (int) (Math.random() * threeLenth);
        int rand4 = (int) (Math.random() * fourLenth);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4];

        System.out.println("Все, что нам нужно, - это " + phrase+".");

    }
}
