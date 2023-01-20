package task3.chapter3.child;

import task3.chapter3.parent.Pet;

/**
 * Класс Cat.
 */
public class Cat extends Pet {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = '" + name + '\'' +
                '}' + "\n";
    }
}
