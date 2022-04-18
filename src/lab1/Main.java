package lab1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        showAnimal(randomAnimal(10));
    }

    public static ArrayList<Animal> randomAnimal(int n) {
        Random random = new Random();
        ArrayList<Animal> animalArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (random.nextInt(2) == 0) {
                animalArray.add(new Parrot(random.nextInt(15), random.nextInt(1000) + 300,
                        random.nextInt(2900) + 100, random.nextInt(2) + 8, getRandomTypeParrot(),
                        random.nextInt(20) + 10));
            } else {
                animalArray.add(new Perch(random.nextInt(23), random.nextInt(100) + 200, random.nextInt(2) + 1,
                        getHabitatTypePerch(), getRandomTypePerch(), random.nextInt(50) + 20));
            }
        }
        return animalArray;
    }

    public static void showAnimal(ArrayList<Animal> animalArray) {
        for (Animal animal : animalArray) {
            System.out.println(animal.getDescription());
        }
    }

    public static String getRandomTypeParrot() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Cockatiel");
        listTypeParrot.add("Cockatoo");
        listTypeParrot.add("Budgie");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public static String getHabitatTypePerch() {
        ArrayList<String> listHabitatTypePerch = new ArrayList<>();
        listHabitatTypePerch.add("River");
        listHabitatTypePerch.add("Sea");
        return listHabitatTypePerch.get(new Random().nextInt(2));
    }

    public static String getRandomTypePerch() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Yellow perch");
        listTypeParrot.add("Sunny");
        listTypeParrot.add("Perch-firebrand");
        return listTypeParrot.get(new Random().nextInt(3));
    }
}
