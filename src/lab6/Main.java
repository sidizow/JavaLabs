package lab6;

import lab6.factory.AnimalFactory;
import lab6.factory.DomesticAnimalFactory;
import lab6.factory.WildAnimalFactory;

/*
Для абстрактной фабрики было добавлено разделение на Домашних и Диких животных, т.е. каждый попугай может быть
диким или домашним (и так для каждого животного). Интерфейс AnimalFactory содержит методы для создания каждого типа
животных. Классы DomesticAnimalFactory и WildAnimalFactory реализуют этот интерфейс, переопределяя его методы для
создания конкретных животных (домашних или диких). Статический метод getAnimalFactory() принимает параметр
"DOMESTIC", либо "WILD", с помощью этого выбирается тип создаваемых животных (т.е. дикие или домашние).
Интерфейсы GooseInt, CarpInt, ParrotInt, PerchInt имеют метод getDescription(), который выводит описание конкретного
животного. Этот интерфейс реализуется в классах расположенных в пакетах "domestic" и "wild".
 */

public class Main {

    public static void main(String[] args) {
        /*
        Заменив в методе getAnimalFactory() "DOMESTIC" на "WILD", меняется тип создаваемых животных с Домашних на
        Диких.
        */

        //AnimalFactory animalFactory = getAnimalFactory("DOMESTIC");
        AnimalFactory animalFactory = getAnimalFactory("WILD");


        ParrotInt parrot = animalFactory.getParrot();
        GooseInt goose = animalFactory.getGoose();
        PerchInt perch = animalFactory.getPerch();
        CarpInt carp = animalFactory.getCarp();

        System.out.println(parrot.getDescription());
        System.out.println(goose.getDescription());
        System.out.println(perch.getDescription());
        System.out.println(carp.getDescription());

    }

    public static AnimalFactory getAnimalFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        }
        if (factoryName.equalsIgnoreCase("DOMESTIC")) {
            return new DomesticAnimalFactory();
        } else if (factoryName.equalsIgnoreCase("WILD")) {
            return new WildAnimalFactory();
        }
        return null;
    }
}
