public class Box <T>  {
    private T name;
    private T price;
    private T color;

    public Box(T name, T price, T color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public Box() {
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
    public static <T> T genericMethod() {
        T box = (T) new Box<>("Strawberry",600,"Red");
        return box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
