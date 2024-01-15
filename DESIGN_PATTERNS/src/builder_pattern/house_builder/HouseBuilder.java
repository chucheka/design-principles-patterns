package builder_pattern.house_builder;

public interface HouseBuilder {
    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void paintHouse();

    void furnishHouse();

    House getHouse();
}