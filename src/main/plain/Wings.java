package plain;

/*
Класс описывающий крылья самолёта
 */
public class Wings {

    //Тип крыла самолёта. Ограничимся прямым, стреловидным и трапециевидным.
    String wingType;

    /*
    Создаём конструктор по умолчанию с прямым типом крыла.
    */
    public Wings() {
        wingType = "прямое";
    }

    /*
    Создаём конструктор где можно указать тип крыла при создании объекта
     */
    public Wings(String wingType) {
        this.wingType = wingType;
    }

    //Напишем два метода. Открыть и закрыть закрылки

    public void openFlaps() {
        System.out.println("Закрылки открыты");
    }

    public void closeFlaps() {
        System.out.println("Закрылки закрыты");
    }
}
