package ua.hillel;

import ua.hillel.fruits.Apple;
import ua.hillel.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Apple oneApple = new Apple();
        Orange oneOrange = new Orange();

        Apple[] manyApples = {oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple,
                oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple, oneApple};
        Orange[] manyOranges = {oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange,
                oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange, oneOrange};

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

//        appleBox.add(oneOrange);
        appleBox.add(oneApple);
        appleBox.addMany(manyApples);

//        orangeBox.add(oneApple);
        orangeBox.add(oneOrange);
        orangeBox.addMany(manyOranges);

        System.out.println(appleBox);
        System.out.println(orangeBox);

        System.out.println("Compare fruit boxes: " + appleBox.compare(orangeBox));

//        appleBox.merge(orangeBox);
        appleBox.merge(appleBox2);
        orangeBox.merge(orangeBox2);

        System.out.println(appleBox);
        System.out.println(orangeBox);
    }
}