package task3.chapter3.child;

import task3.chapter3.parent.Pet;

/**
 * Класс Parrot.
 */
public class Parrot extends Pet {

    private String name;

    public Parrot(String name) {
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
        return "Parrot{" +
                "name = '" + name + '\'' +
                '}' + "\n";
    }

}
