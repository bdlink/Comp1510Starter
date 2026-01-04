/**
 * Demonstrates the use of primitive data types and arithmetic expressions.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */

/**
 * Computes the Fahrenheit equivalent of a specific Celsius value using the
 * formula F = (9/5)C + 32.
 */
void main() {
    final int base = 32;
    final double conversionFactor = 1.8;

    double fahrenheitTemp;

    // value to convert:
    final int celsiusTemp = 24;

    fahrenheitTemp = celsiusTemp * conversionFactor + base;

    IO.println("Celsius Temperature: " + celsiusTemp);
    IO.println("Fahrenheit Equivalent: " + fahrenheitTemp);
}
