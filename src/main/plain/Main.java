package plain;

import plain.exceptions.NumberOfEnginesException;

public class Main {
    public static void main(String[] args) {
        Plain plain1 = new Plain(); //создастся самолёт по умолчанию
        Plain plain2 = new Plain(4); //создастся самолёт с 4-мя двигателями
        Plain plain3 = new Plain(4, "поршневой"); //создастся самолёт с 4-мя двигателями с поршневым типом
        Plain plain4 = new Plain(4, "турбовинтовой", "однопалубный", "титан", "прямое");
        plain4.takeoff();
        System.out.println("____________");
        System.out.println("Полёт");
        System.out.println("____________");
        plain4.landing();
        //Plain plain5 = new Plain(3); //Если раскомментировать эту будет выброшено исключение и программа прервётся

        //Обрабатываем исключение
        try {
            Plain plain = new Plain(3);
        } catch (NumberOfEnginesException exception) {
            System.out.println("Сообщение ошибки: " + exception.getMessage()); //Самый простой и примитивный вариант обработки исключения
        }
    }
}
