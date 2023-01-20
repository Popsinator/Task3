package task3.model;

/**
 * Класс Product (пусть будет одно поле - имя игрушки)
 */
public class Product {

    private String name;

    public Product(String name) {
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
        return "Product{" +
                "name = '" + name + '\'' +
                '}' + "\n";
    }
}
