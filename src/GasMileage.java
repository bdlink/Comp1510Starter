/**
 * Demonstrates the use of the Scanner class to read numeric data.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */
void main() {
    int miles;
    double gallons;
    double mpg;

    Scanner scan = new Scanner(System.in);

    IO.print("Enter the number of miles: ");
    miles = scan.nextInt();

    IO.print("Enter the gallons of fuel used: ");
    gallons = scan.nextDouble();

    mpg = miles / gallons;

    IO.println("Miles Per Gallon: " + mpg);

    scan.close();
}
