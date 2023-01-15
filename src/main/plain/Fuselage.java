package plain;

/*
Класс описывающий фюзеляж самолёта
 */
public class Fuselage {
    // Может быть узкофюзеляжный, широкофюзеляжный, однопалубный и двухпалубный (ограничимся этим набором, на самом деле типов фюзеляжей больше)
    String fuselageType;
    //Поле описывает из чего сделан фюзеляж. Ограничимся алюминием и титаном.
    String material;
    //Поле описывает состояние дверей (открыты или закрыты). По умолчанию двери открыты (значение true).
    boolean isDoorsOpen;

    /*
    Создаём ниже конструктор по умолчанию. Пусть тип будет узкофюзеляжный, а материал - алюминий.
     */
    public Fuselage() {
        fuselageType = "узкофюзеляжный";
        material = "алюминий";
        isDoorsOpen = true;
    }

    /*
    Создаём ниже конструктор где можем задать тип фюзеляжа, а материал будет алюминий.
     */
    public Fuselage(String fuselageType) {
        this.fuselageType = fuselageType;
        material = "алюминий";
        isDoorsOpen = true;
    }

    /*
    Создаём ниже конструктор где можем задать тип фюзеляжа и материал.
     */
    public Fuselage(String fuselageType, String material) {
        this.fuselageType = fuselageType;
        this.material = material;
        isDoorsOpen = true;
    }

    //Далее напишем два метода. Первый открытие дверей самолёта, второй - закрытие.

    /*
    Метод по открытию дверей самолёта.
     */
    public void openDoors() {
        isDoorsOpen = true;
        System.out.println("Двери открыты");
    }

    /*
    Метод по закрытию дверей самолёта.
     */
    public void closeDoors() {
        isDoorsOpen = false;
        System.out.println("Двери закрыты");
    }
}
