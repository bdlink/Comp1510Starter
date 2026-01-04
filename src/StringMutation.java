/**
 * Demonstrates the use of the String class and its methods.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */

/**
 * Prints a String and various mutations of it.
 */
void main() {
    String phrase = "Change is inevitable";
    String mutation1;
    String mutation2;
    String mutation3;
    String mutation4;

    IO.println("Original string: \"" + phrase + "\"");
    IO.println("Length of string: " + phrase.length());

    mutation1 = phrase.concat(", except from vending machines.");
    mutation2 = mutation1.toUpperCase();
    mutation3 = mutation2.replace('E', 'X');

    // With magic numbers you may not understand the following:
    mutation4 = mutation3.substring(3, 30);

    // Prints each mutated string
    IO.println("Mutation #1: " + mutation1);
    IO.println("Mutation #2: " + mutation2);
    IO.println("Mutation #3: " + mutation3);
    IO.println("Mutation #4: " + mutation4);

    IO.println("Mutated length: " + mutation4.length());
}
