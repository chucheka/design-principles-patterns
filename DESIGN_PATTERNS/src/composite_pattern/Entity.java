package composite_pattern;

/*
    In the composite design pattern this is know as the component.
    Component is an abstract base class/interface for the objects in the tree structure.
    This class defines the default behavior for all objects and behaviors to access and
    manage child components in the tree
 */
public abstract class Entity {
    public String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract int getSalary();

}
