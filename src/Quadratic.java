import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 *  Demonstrates the use of the Math class to perform a calculation
 *  based on user input.
 *  Illustrates import static.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */

/**
 * Determines the roots of a quadratic equation.
 */
void main(String[] args) {
    // ax^2 + bx + c
    int a;
    int b;
    int c;

    final int discFactor = 4;
    double discriminant;
    double root1;
    double root2;

    Scanner scan = new Scanner(System.in);

    IO.print("Enter the coefficient of x squared: ");
    a = scan.nextInt();

    IO.print("Enter the coefficient of x: ");
    b = scan.nextInt();

    IO.print("Enter the constant: ");
    c = scan.nextInt();

    // Uses the quadratic formula to compute the roots.
    // Assumes a positive discriminant.
    discriminant = pow(b, 2) - (discFactor * a * c);
    root1 = (-b + sqrt(discriminant)) / (2 * a);
    root2 = (-b - sqrt(discriminant)) / (2 * a);

    IO.println("Root #1: " + root1);
    IO.println("Root #2: " + root2);

    scan.close();
}
