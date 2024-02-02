package bridge_pattern;

import bridge_pattern.furniture_example.*;

/*

    Bridge is a structural design pattern that lets you split a large
    class or a set of closely related classes into two separate
    hierarchies—abstraction and implementation—which can be
    developed independently of each other.

    Abstraction (also called interface) is a high-level control layer
    for some entity. This layer isn’t supposed to do any real work
    on its own. It should delegate the work to the implementation
    layer (also called platform)

    The Abstraction provides high-level control logic. It relies on
    the implementation object to do the actual low-level work

    The Implementation declares the interface that’s common for
    all concrete implementations. An abstraction can only communicate
    with an implementation object via methods that are declared here

    Bridge Pattern helps to decouple an Abstration from its implementation, so that the two
    can vary or scale independently.
    Anytime we find ourselves extending a class in to independent dimensions then we should you the
    bridge pattern

    Use the pattern when you need to extend a class in several
    orthogonal (independent) dimensions.

    For our example we can choose to start making furniture with glasses and rubber
    and that won't increase the number of furniture types that we have.

    Or we can choose to start making other types of furniture like bed frames, wardrobes
    and that will not affect the number of material we currently use in making furniture

    FurnitureItem is the abstraction here while the IMaterial is the implementation.
    Or you can look at it in terms of dimensions: Furniture Item and Material
 */
public class BridgePattern {

    public static void main(String[] args) {

        IMaterial wood = new Wood();

        FurnitureItem woodenChair = new Chair(wood);

        woodenChair.assemble();


        IMaterial metal = new Metal();

        FurnitureItem metalTable = new Table(metal);

        metalTable.assemble();
    }
}
