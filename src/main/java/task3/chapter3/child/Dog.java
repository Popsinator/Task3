package task3.chapter3.child;

import task3.chapter3.parent.Pet;

/**
 * Класс Dog.
 */
public class Dog extends Pet {

    private String name;

    public Dog(String name) {
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
        return "Dog{" +
                "name = '" + name + '\'' +
                '}' + "\n";
    }
}
