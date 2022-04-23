package lab7;

import java.util.*;

/*
В данной лабораторной работе для 1 этажа используется массив типа Room[], для 2 этажа ArrayList, для 3 этажа
LinkedList. Каждый этаж запоняется случайными команатами со случайными площадями с помощью статических методов
getRandomTypeRoom() и getRandomSquareRoom(). Для каждого этажа используется итератор, внутри циклов while считывается
 значение (комната), значение ее площади складывается в выделенной переменной для подсчета площади этажа. После этого
  вызывается метод sumSquareTypeRoom(), который считает площадь в зависимости от типа комнаты. После всех подсчетов
  складываются переменные содержащие площади этажей для получения общей площади и результат выводится на экран. Также
   выводится площадь по этажам и по типу комнат.
 */
public class Main {
    public static Iterator<Room> iterator;
    public static int squareFirstFloor;
    public static int squareSecondFloor;
    public static int squareThirdFloor;
    public static int squareBadrooms;
    public static int squareKitchens;
    public static int squareLivings;

    public static void main(String[] args) {
        Room[] floor1 = new Room[10];
        ArrayList<Room> floor2 = new ArrayList<>();
        LinkedList<Room> floor3 = new LinkedList<>();

        /*
        Цикл для проверки. На первом этаже 10 Bedroom  с площадью 1 => Площадь этажа должна равняться 10. Площадь
        всех комнат типа Bedroom должна равняться также 10.
        На втором этаже 10 Kitchen  с площадью 2 => Площадь этажа должна равняться 20. Площадь
        всех комнат типа Kitchen должна равняться также 20.
        На втором этаже 10 Living  с площадью 3 => Площадь этажа должна равняться 30. Площадь
        всех комнат типа Living должна равняться также 30.
         */
        /*
        for (int i = 0; i < 10; i++) {
            floor1[i] = new Room("Bedroom", 1);
            floor2.add(new Room("Kitchen", 2));
            floor3.add(new Room("Living", 3));
        }
        */

        for (int i = 0; i < 10; i++) {
            floor1[i] = new Room(getRandomTypeRoom(), getRandomSquareRoom());
            floor2.add(new Room(getRandomTypeRoom(), getRandomSquareRoom()));
            floor3.add(new Room(getRandomTypeRoom(), getRandomSquareRoom()));
        }
        System.out.println(sumSquare(floor1, floor2, floor3));

    }

    public static String sumSquare(Room[] floor1, ArrayList<Room> floor2, LinkedList<Room> floor3) {
        Room room;
        squareFirstFloor = 0;
        squareSecondFloor = 0;
        squareThirdFloor = 0;
        squareBadrooms = 0;
        squareKitchens = 0;
        squareLivings = 0;

        iterator = Arrays.stream(floor1).iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareFirstFloor += room.getSquare(); //Считается площадь 1 этажа
            sumSquareTypeRoom(room);// Считается площадь в зависимости от типа комнаты.
        }

        iterator = floor2.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareSecondFloor += room.getSquare();
            sumSquareTypeRoom(room);
        }
        iterator = floor3.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareThirdFloor += room.getSquare();
            sumSquareTypeRoom(room);
        }
        return "Общая площадь здания: " + (squareFirstFloor + squareSecondFloor + squareThirdFloor) + "м^2\nПлощадь " +
                "первого этажа: " + squareFirstFloor + "м^2\nПлощадь второго этажа: " + squareSecondFloor +
                "м^2\nПлощадь третьего этажа: " + squareThirdFloor + "м^2\nПлощадь спален: " + squareBadrooms +
                "м^2\nПлощадь кухонь: " + squareKitchens + "м^2\nПлощадь гостинных: " + squareLivings + "м^2";
    }

    public static void sumSquareTypeRoom(Room room){
        switch (room.getType()){
            case "Bedroom" -> squareBadrooms += room.getSquare();
            case "Kitchen" -> squareKitchens += room.getSquare();
            case "Living" -> squareLivings += room.getSquare();
        }
    }

    public static String getRandomTypeRoom() {
        ArrayList<String> listTypeRoom = new ArrayList<>();
        listTypeRoom.add("Bedroom");
        listTypeRoom.add("Kitchen");
        listTypeRoom.add("Living");
        return listTypeRoom.get(new Random().nextInt(3));
    }

    public static int getRandomSquareRoom() {
        return new Random().nextInt(5) + 15;
    }
}
