package ua.hillel;

import ua.hillel.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> fruitBox = new ArrayList<>();

    public void add(T fruit) {
        fruitBox.add(fruit);
    }

    public void addMany(T[] fruit) {
        fruitBox.addAll(toList(fruit));
    }

    public float getWeight() {
        float boxWeight = 0.0F;
        for (Fruit fruit : fruitBox) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        if (box != null) {
            return this.getWeight() == box.getWeight();
        }
        return false;
    }

    public void merge(Box<T> box) {
        if (box != null) {
            this.fruitBox.addAll(box.getFruitBox());
        }
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }

    private List<T> toList(T[] array) {
        return Arrays.asList(array);
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitBox=" + fruitBox +
                ", boxWeight=" + getWeight() +
                '}';
    }
}
