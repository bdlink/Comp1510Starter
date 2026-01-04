/**
 * Demonstrates the creation of pseudo-random numbers using the RandomGenerator
 *  interface.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */

/**
 * Generates random numbers in various ranges.
 */
void main() {
    // These are just sample numbers, so hard to have meaningful names here
    final int ten = 10;
    final int fifteen = 15;
    final int twenty = 20;
    final int dieMax = 6;

    // RandomGenerator is a type that includes the Random class.
    // See discussion in chapter 7, interfaces.
    // getDefault returns a random number generator with better statistics
    // than the Random class.
    RandomGenerator generator = RandomGenerator.getDefault();
    IO.println(generator);
    int num1;
    float num2;

    System.out.println("""
            ***********************************************
            Example of random numbers from java.util.Random
            ***********************************************
            """);
    num1 = generator.nextInt();
    IO.println("A random integer: " + num1);

    num1 = generator.nextInt(ten);
    IO.println("From 0 to 9: " + num1);

    num1 = generator.nextInt(ten) + 1;
    IO.println("From 1 to 10: " + num1);

    num1 = generator.nextInt(fifteen) + twenty;
    IO.println("From 20 to 34: " + num1);

    num1 = generator.nextInt(twenty) - ten;
    IO.println("From -10 to 9: " + num1);

    num2 = generator.nextFloat();
    IO.println("A random float (between 0-1): " + num2);

    // 0.0 to 5.999999
    num2 = generator.nextFloat() * dieMax;
    num1 = (int) num2 + 1;
    IO.println("From 1 to 6: " + num1);
}
