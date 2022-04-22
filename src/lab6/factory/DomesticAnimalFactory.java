package lab6.factory;

import lab6.*;
import lab6.domestic.DomesticCarp;
import lab6.domestic.DomesticGoose;
import lab6.domestic.DomesticParrot;
import lab6.domestic.DomesticPerch;

import java.util.ArrayList;
import java.util.Random;

public class DomesticAnimalFactory implements AnimalFactory{
    private final Random random = new Random();

    @Override
    public ParrotInt getParrot() {
        return new DomesticParrot(random.nextInt(15)+3, random.nextInt(1000) + 200,
                random.nextInt(2900) + 100, random.nextInt(50) + 5,
                getRandomTypeParrot());
    }

    @Override
    public GooseInt getGoose() {
        return new DomesticGoose(random.nextInt(20)+3, random.nextInt(5000) + 500,
                random.nextInt(8000) + 100, random.nextInt(80) + 5,
                getRandomTypeGoose());
    }

    @Override
    public PerchInt getPerch() {
        return new DomesticPerch(random.nextInt(23)+3, random.nextInt(2000) + 200,
                random.nextInt(2) + 1, random.nextInt(50) + 20, getRandomTypePerch());
    }

    @Override
    public CarpInt getCarp() {
        return new DomesticCarp(random.nextInt(30)+3, random.nextInt(2300) + 200,
                random.nextInt(3) + 1, random.nextInt(40) + 20, getRandomTypeCarp());
    }

    public String getRandomTypeParrot() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Cockatiel");
        listTypeParrot.add("Cockatoo");
        listTypeParrot.add("Budgie");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public String getRandomTypeGoose() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Gray");
        listTypeParrot.add("Nile");
        listTypeParrot.add("Andean");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public String getRandomTypePerch() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Yellow perch");
        listTypeParrot.add("Sunny");
        listTypeParrot.add("Perch-firebrand");
        return listTypeParrot.get(new Random().nextInt(3));
    }

    public String getRandomTypeCarp() {
        ArrayList<String> listTypeParrot = new ArrayList<>();
        listTypeParrot.add("Scaly");
        listTypeParrot.add("Mirror");
        listTypeParrot.add("Koi");
        return listTypeParrot.get(new Random().nextInt(3));
    }
}
