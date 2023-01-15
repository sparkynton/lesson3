package plain.exceptions;

/*
Это класс где мы создаем своё собственное исключение. Применяем его в случае если проверка на количество двигателей
завершилась неудачей. Предполагаем что количество двигателей чётное количество в противном случае кидаем это исключение.
 */
public class NumberOfEnginesException extends RuntimeException {
    public NumberOfEnginesException(String message) {
        super(message);
    }
}
