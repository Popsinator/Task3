package task3;

import task3.model.Box;

import java.util.ArrayList;

/**
 * Создать ArrayList, содержащий объекты Box.
 * Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
 * Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
 */

public class Chapter1 {

    public static void sortCollection(ArrayList<Box> oldList, ArrayList<Box> newList) {

        System.out.println("Коллекция с объектами Box: " + "\n" + oldList);
        System.out.println("Коллекция, в которую будем перемещать объекты, превышающие вес:" + "\n" + newList);

        for(int i = 0; i < oldList.size(); i++) {
            if (oldList.get(i).getWeight() > 300) {
                newList.add(oldList.get(i));
                oldList.remove(i);
            }
        }

        System.out.println("Искомая коллекция: " + "\n" + oldList);
        System.out.println("Коллекция с тяжёлыми коробками: " + "\n" + newList);
    }
}
