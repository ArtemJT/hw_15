package ua.hillel;

import ua.hillel.fruits.Apple;
import ua.hillel.fruits.Fruit;
import ua.hillel.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Fruit oneApple = new Apple();
        Fruit oneOrange = new Orange();

        Fruit[] manyApples = {oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple,
                oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple};
        Fruit[] manyOranges = {oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange,
                oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange};

        Box<Fruit> appleBox = new Box<>();
        Box<Fruit> orangeBox = new Box<>();


        Box<Fruit> appleBox2 = new Box<>();
        Box<Fruit> orangeBox2 = new Box<>();

        appleBox.add(oneOrange);
        appleBox.add(oneApple);
        appleBox.addMany(manyApples);

        orangeBox.add(oneApple);
        orangeBox.add(oneOrange);
        orangeBox.addMany(manyOranges);

        System.out.println(appleBox);
        System.out.println(orangeBox);

        System.out.println("Compare fruit boxes: " + appleBox.compare(orangeBox));

        appleBox.merge(appleBox2);
        orangeBox.merge(orangeBox2);

        appleBox.merge(orangeBox);

        System.out.println(appleBox);
        System.out.println(orangeBox);
    }
}