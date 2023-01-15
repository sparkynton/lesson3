package plain;

import plain.exceptions.EngineTypeException;
import plain.exceptions.FuselageTypeOrMaterialException;
import plain.exceptions.NumberOfEnginesException;
import plain.exceptions.WingTypeException;

/*
Класс описывающий объект из реального мира - самолёт
 */
public class Plain {

    //Ниже перечисляем поля класса, которые являются частями самолёта
    Fuselage plainFuselage; // у этого поля тип Fuselage и представляет собой фюзеляж самолёта
    Engine[] plainEngines; // у этого поля тип Engine и представляет собой двигатели самолёта
    Wings plainWings; // у этого поля тип Wings и представляет собой крылья самолёта

    //Теперь пишем конструкторы для этого класса

    /*
    Первый конструктор. Используется для получения объекта Plain "по умолчанию". Подходит когда нам нужно создать
    объект подходящий для большинства задач в нашей программе и не требующий специальных параметров создания.
     */
    public Plain() {
        plainFuselage = new Fuselage();
        plainEngines = new Engine[2];
        for (int i = 0; i < plainEngines.length; i++) {
            plainEngines[i] = new Engine();
        }
        plainWings = new Wings();
    }

    /*
    Второй конструктор. Здесь мы уже можем задать количество двигателей при создании нашего самолёта, но при этом
    тип двигателей будет использован по умолчанию (тот который указан в дефолтном конструкторе объекта Engine).
     */
    public Plain(int numberOfEngines) {
        //Проверяем, что количество двигателей чётное число. Если нет, то кидаем исключение NumberOfEnginesException
        if (numberOfEngines % 2 != 0) {
            throw new NumberOfEnginesException("Количество двигателей должно быть чётным");
        }
        plainFuselage = new Fuselage();
        plainEngines = new Engine[numberOfEngines];
        for (int i = 0; i < plainEngines.length; i++) {
            plainEngines[i] = new Engine();
        }
        plainWings = new Wings();
    }

    /*
    Третий конструктор. Здесь мы можем задать количество двигателей и их тип.
     */
    public Plain(int numberOfEngines, String engineType) {
        //Проверяем, что количество двигателей чётное число. Если нет, то кидаем исключение NumberOfEnginesException
        if (numberOfEngines % 2 != 0) {
            throw new NumberOfEnginesException("Количество двигателей должно быть чётным");
        }
        //Проверяем, что тип двигателя указан верный. Если нет, то кидаем исключение EngineTypeException
        if (!(engineType.equals("поршневой") || engineType.equals("газотурбинный") || engineType.equals("турбовинтовой"))) {
            throw new EngineTypeException("указан неподходящий тип двигателя");
        }
        //Инициализируем поля класса. Если не инициализировать какое-либо поле, то оно проинициализируется с помощью
        //конструктора по умолчанию. Так поля plainFuselage и plainWings будут инициализированы такими конструкторами.
        plainEngines = new Engine[numberOfEngines];
        for (int i = 0; i < plainEngines.length; i++) {
            plainEngines[i] = new Engine(engineType);
        }
    }

    /*
    Конструкторов для этого класса может быть много. В них помимо информации о типе двигателя может передаваться тип
    фюзеляжа или тип фюзеляжа и его материал, тип крыльев. Здесь я не буду приводить их все. Можете потренироваться и
    написать их для своего объекта из реального мира. Напишем только два конструктора, которые принимают на вход
    параметры для инициализации всех полей нашего класса Plain.
     */

    //Конструктор в котором передаются параметры для инициализации всех полей класса
    public Plain(int numberOfEngines, String engineType, String fuselageType, String fuselageMaterial, String wingType) {
        //Проверяем, что количество двигателей чётное число. Если нет, то кидаем исключение NumberOfEnginesException
        if (numberOfEngines % 2 != 0) {
            throw new NumberOfEnginesException("Количество двигателей должно быть чётным");
        }
        //Проверяем, что тип двигателя указан верный. Если нет, то кидаем исключение EngineTypeException
        if (!(engineType.equals("поршневой") || engineType.equals("газотурбинный") || engineType.equals("турбовинтовой"))) {
            throw new EngineTypeException("указан неподходящий тип двигателя");
        }
        //Проверяем, что тип фюзеляжа указан верный. Если нет бросаем FuselageTypeOrMaterialException
        if (!(fuselageType.equals("узкофюзеляжный") || fuselageType.equals("широкофюзеляжный") || fuselageType.equals("однопалубный") || fuselageType.equals("двухпалубный"))) {
            throw new FuselageTypeOrMaterialException("указан неверный тип фюзеляжа");
        }
        //Проверяем, что материал фюзеляжа указан верный. Если нет бросаем FuselageTypeOrMaterialException
        if (!(fuselageMaterial.equals("алюминий") || fuselageMaterial.equals("титан"))) {
            throw new FuselageTypeOrMaterialException("указан неверный материал фюзеляжа");
        }
        //Проверяем, что тип крыла указан верный. Если нет бросаем WingTypeException
        if (!(wingType.equals("прямое") || wingType.equals("стреловидное") || wingType.equals("трапециевидное"))) {
            throw new WingTypeException("указан неверный тип крыла");
        }
        //Инициализируем поля класса
        plainFuselage = new Fuselage(fuselageType, fuselageMaterial);
        plainWings = new Wings(wingType);
        plainEngines = new Engine[numberOfEngines];
        for (int i = 0; i < plainEngines.length; i++) {
            plainEngines[i] = new Engine(engineType);
        }
    }

    //Конструктор, который на вход уже принимает готовые объекты для инициализации полей класса
    public Plain(Fuselage fuselage, Engine[] engines, Wings wings) {
        /*
        Здесь также можно проводить проверки на корректность указанных данных. Для этого нужно обращаться к полям
        передаваемых в качестве аргументов объектов и сравнивать с допустимыми. Но будем считать что передаваемые
        готовые объекты проинициализированы с корректными значениями.
         */
        plainFuselage = fuselage;
        plainWings = wings;
        plainEngines = engines;
    }

    //Теперь напишем два метода для самолёта. Это взлёт и посадка.

    public void takeoff() {
        plainFuselage.closeDoors();
        plainWings.closeFlaps();
        for (int i = 0; i < plainEngines.length; i++) {
            plainEngines[i].startEngine();
        }
        System.out.println("Разгоняемся по взлётной полосе");
        System.out.println("Взлетаем");
    }

    public void landing() {
        plainWings.openFlaps();
        System.out.println("Снижаемся");
        System.out.println("Садимся на взлётную полосу и тормозим");
        for (int i = 0; i < plainEngines.length; i++) {
            plainEngines[i].stopEngine();
        }
        plainFuselage.openDoors();
    }

}
