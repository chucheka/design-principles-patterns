package prototype_pattern;

public abstract class Shape {

    public String color;

    public Shape() {

    }

    /*
     The prototype constructor
     A fresh object is initialized with values from the existing object.
     */
    public Shape(Shape shape) {
        this();
        this.color = shape.color;

    }

    public abstract Shape clone();
}
