package prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypePattern {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();

        circle.radius = 20;
        circle.color = "Red";

        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();

        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.height = 5;
        rectangle.width = 20;

        shapes.add(rectangle);


        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape shape : shapes) {

            shapesCopy.add(shape.clone());

        }

        shapesCopy.stream().forEach(shape -> System.out.println(shape.toString()));
    }
}
