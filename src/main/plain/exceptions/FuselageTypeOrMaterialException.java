package plain.exceptions;
/*
Это класс где мы создаем своё собственное исключение. Применяем его в случае если проверка на тип фюзеляжа или материал
из которого он изготовлен завершилась неудачей.
 */
public class FuselageTypeOrMaterialException extends IllegalArgumentException {
    public FuselageTypeOrMaterialException(String s) {
        super(s);
    }
}
