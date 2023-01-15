package plain.exceptions;
/*
Это класс где мы создаем своё собственное исключение. Применяем его в случае если проверка на тип крыла
завершилась неудачей.
 */
public class WingTypeException extends IllegalArgumentException {
    public WingTypeException(String s) {
        super(s);
    }
}
