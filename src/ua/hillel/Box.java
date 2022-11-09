package ua.hillel;

import ua.hillel.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
        checkOnNull(box);
        return this.getWeight() == box.getWeight();
    }

    public void merge(Box<T> box) {
        checkOnNull(box);
        this.fruitBox.addAll(box.getFruitBox());
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }

    private void checkOnNull(Box<?> box) {
        if (Objects.isNull(box)) throw new IllegalArgumentException("Argument is NULL");
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
