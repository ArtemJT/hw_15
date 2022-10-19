package ua.hillel.fruits;

public abstract class Fruit {

    private final float weight;
    private final String fruitType;

    protected Fruit() {
        this.fruitType = getClass().getSimpleName();
        this.weight = setWeight();
    }

    public float getWeight() {
        return weight;
    }

    protected abstract float setWeight();

    @Override
    public String toString() {
        return "Fruit{" +
                '\'' + fruitType + '\'' +
                ", weight=" + weight +
                '}';
    }
}
