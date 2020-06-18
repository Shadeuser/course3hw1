package task1and2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] ar = {10, 20, 30, 50, 70};
        List<Integer> myLst = new ArrayList<>();



        changeElements(ar, 0, 4);
        System.out.println("Измененные элементы массива");
        for (int el: ar) {
            System.out.println(el);
        }

        myLst = arrayToArrayList(ar);
        for (int i = 0; i < myLst.size() ; i++) {
            System.out.println(myLst.get(i));
        }



    }
    //Задание 1
    public static <T> void changeElements(T[] ar, int el1, int el2) {
        T element = ar[el1];
        ar[el1] = ar[el2];
        ar[el2] = element;
    }

    //Задание 2
    public static <T> List<T> arrayToArrayList(T[] ar) {
        List<T> lst = new ArrayList<>(Arrays.asList(ar));
        return lst;

    }
    
}
