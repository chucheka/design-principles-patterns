package prototype_pattern;

public class Circle extends Shape {

    public int radius;

    public Circle(){

    }

    public Circle(Circle circle) {

        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
