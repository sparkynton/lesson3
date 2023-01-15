package plain;

/*
Класс описывающий двигатели самолёта
 */
public class Engine {
    //Поле описывает тип двигателя. Ограничимся поршневым, газотурбинным и турбовинтовым.
    String engineType;

    /*
    Создаём конструктор по умолчанию с типом двигателя турбовинтовым.
     */
    public Engine() {
        engineType = "турбовинтовой";
    }

    /*
    Создаём конструктор где можно указать тип двигателя при создании объекта
     */
    public Engine(String engineType) {
        this.engineType = engineType;
    }

    //Напишем два метода по старту двигателя и его остановке
    public void startEngine() {
        System.out.println("Двигатель запускается");
    }

    public void stopEngine() {
        System.out.println("Двигатель останавливается");
    }
}
