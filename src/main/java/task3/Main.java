package task3;

import task3.chapter3.child.Cat;
import task3.chapter3.child.Dog;
import task3.chapter3.child.Parrot;
import task3.chapter3.parent.Pet;
import task3.model.Box;
import task3.model.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*
          Сценарий для ArrayList
         */
        System.out.println("Часть 1");

        Box box1 = new Box(400, 10, 10, 10);
        Box box2 = new Box(100, 20, 20, 20);
        Box box3 = new Box(200, 40, 40, 40);

        ArrayList<Box> listBox = new ArrayList<>();

        listBox.add(box1);
        listBox.add(box2);
        listBox.add(box3);

        ArrayList<Box> newListBox = new ArrayList<>();
        Chapter1.sortCollection(listBox, newListBox);

        /*
          Сценарий для HashMap (Задание 2 - Игрушки)
         */
        System.out.println("Часть 2");

        Product toy1 = new Product("Медвежонок");
        Product toy2 = new Product("Зайчик");
        Product toy3 = new Product("Собачка");

        HashMap<String, Product> map = new HashMap<>();

        map.put(toy1.getName(), toy1);
        map.put(toy2.getName(), toy2);
        map.put(toy3.getName(), toy3);
        Chapter2.sortAndPrintHashMapWithEntrySet(map);
        Chapter2.sortAndPrintHashMapWithKeySet(map);
        Chapter2.sortAndPrintHashMapWithValues(map);

        /*
          Сценарий для HashMap (Задание 3 - Домашние животные)
         */
        System.out.println("Часть 3");

        Dog dog = new Dog("Дружок");
        Cat cat = new Cat("Барсик");
        Parrot parrot = new Parrot("Кеша");

        HashMap<String, Pet> pets = new HashMap<>();

        pets.put(dog.getName(), dog);
        pets.put(cat.getName(), cat);
        pets.put(parrot.getName(), parrot);

        Chapter3.printKeyMap(pets);
    }
}