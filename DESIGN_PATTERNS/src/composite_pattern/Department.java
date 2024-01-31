package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Department extends Entity {
    private final List<Entity> entities = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    @Override
    public int getSalary() {
        // Store the calculated salary to avoid recursion
        int totalSalary = entities.stream().mapToInt(Entity::getSalary).sum();
        return totalSalary;
    }
}
