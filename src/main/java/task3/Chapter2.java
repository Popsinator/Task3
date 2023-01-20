package task3;

import task3.model.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать HashMap.
 * 1.    Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
 * 2.    Перебрать и распечатать пары значений - entrySet().
 * 3.    Перебрать и распечатать набор из имен продуктов  - keySet().
 * 4.    Перебрать и распечатать значения продуктов - values().
 * 5.    Для каждого перебора создать свой метод.
 */
public class Chapter2 {

    public static void sortAndPrintHashMapWithEntrySet(HashMap<String, Product> map) {
        System.out.println("\nВывод с помощью entrySet()");
        for (Map.Entry<String, Product> stringProductEntry : map.entrySet()) {
            System.out.println("Ключ (имя): " + stringProductEntry.getKey() + "--> + Значение (Product) --> " +
                    stringProductEntry.getValue());
        }
    }

    public static void sortAndPrintHashMapWithKeySet(HashMap<String, Product> map) {
        System.out.println("Вывод с помощью keySet()");
        for (String s : map.keySet()) {
            System.out.println("Ключ (имя): " + s);
        }
    }

    public static void sortAndPrintHashMapWithValues(HashMap<String, Product> map) {
        System.out.println("\nВывод с помощью values()");
        for (Product product : map.values()) {
            System.out.println("Значение (Product) --> " + product);
        }
    }
}
