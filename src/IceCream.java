
/**
 * Demonstrates the use of enumerated types.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */

/**
 * Enumeration type representing some flavours of ice cream.
 */
enum Flavour {
    /** plain vanilla flavour. */
    vanilla,
    /** smooth chocolate flavour. */
    chocolate,
    /** smooth strawberry flavour. */
    strawberry,
    /** fudge flavour with fudge pieces. */
    fudgeRipple,
    /** light coffee flavour. */
    coffee,
    /** chocolate, nuts, marshmallow flavour. */
    rockyRoad,
    /** mint flavour with chocolate chip. */
    mintChocolateChip,
    /** chocolate chip cookie dough in vanilla flavour. */
    cookieDough
}

/**
 * Creates and uses variables of the Flavour type.
 * 
 */
void main() {
    Flavour cone1;
    Flavour cone2;
    Flavour cone3;

    cone1 = Flavour.rockyRoad;
    cone2 = Flavour.chocolate;

    IO.println("cone1 value: " + cone1);
    IO.println("cone1 ordinal: " + cone1.ordinal());
    IO.println("cone1 name: " + cone1.name());

    IO.println();
    IO.println("cone2 value: " + cone2);
    IO.println("cone2 ordinal: " + cone2.ordinal());
    IO.println("cone2 name: " + cone2.name());

    cone3 = cone1;

    IO.println();
    IO.println("cone3 value: " + cone3);
    IO.println("cone3 ordinal: " + cone3.ordinal());
    IO.println("cone3 name: " + cone3.name());
}
