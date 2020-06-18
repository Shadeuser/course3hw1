package task3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }


    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public Float getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < fruitList.size(); i++) {
            weight += fruitList.get(i).getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }


    public void pourFruits(Box<T> box) {
        if (box == this) {
            throw new IdentException("Ошибка идентификации. Нельзя передавать в параметр самого себя.");
        }

        //Вариант без выброса исключения
//        if (box == this) {
//            return;
//        }

        while (this.fruitList.size() > 0) {
            box.addFruit(this.fruitList.get(0));
            this.fruitList.remove(0);
        }
    }

}
