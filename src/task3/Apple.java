package task3;

public class Apple extends Fruit {
    private Float weight;

    public Apple() {
        this.weight = 1.0f;
    }

    @Override
    public Float getWeight() {
         return weight;
    }
}
