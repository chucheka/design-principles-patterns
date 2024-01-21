package prototype_pattern;

public class Rectangle extends Shape {

    public int height;
    public int width;

    public Rectangle() {

    }


    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.height = rectangle.height;
        this.width = rectangle.width;

    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
