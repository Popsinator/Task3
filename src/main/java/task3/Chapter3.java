package task3;

import task3.chapter3.parent.Pet;

import java.util.HashMap;

/**
 * Создать HashMap.
 * 1.    Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * 2.    Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
 * 3.    Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
 */
public class Chapter3 {

    public static void printKeyMap(HashMap<String, Pet> pets) {
        System.out.println("\nВывод с помощью keySet()");
        for (String s : pets.keySet()) {
            System.out.println(s);
        }
    }
}
