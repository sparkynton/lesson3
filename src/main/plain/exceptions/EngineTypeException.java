package plain.exceptions;
/*
Это класс где мы создаем своё собственное исключение. Применяем его в случае если проверка на тип двигателей
завершилась неудачей.
 */
public class EngineTypeException extends IllegalArgumentException {
    public EngineTypeException(String s) {
        super(s);
    }
}
