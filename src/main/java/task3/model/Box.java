package task3.model;

/**
 * Объект Box имеет поля: вес, высота, широта, глубина.
 */
public class Box {

    private int weight;

    private int height;

    private int width;

    private int depth;

    public Box(int weight, int height, int width, int depth) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", depth='" + depth + '\'' +
                '}' + "\n";
    }
}
