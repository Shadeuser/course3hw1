package task3;

public class Main {
    public static void main(String[] args) {
    //Задание 3

        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> newAppleBox = new Box<>();


        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);

        newAppleBox.addFruit(apple);
        newAppleBox.addFruit(apple);
        newAppleBox.addFruit(apple);


        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);


        System.out.println("Коробка 1 равна коробе 2 ? " + appleBox.compare(orangeBox));
        System.out.println("Вес до пересыпания " + appleBox.getWeight());
        appleBox.pourFruits(newAppleBox);
        System.out.println("Вес после пересыпания " + appleBox.getWeight());
        System.out.println("Вес новой коробки " + newAppleBox.getWeight());


    }
}
