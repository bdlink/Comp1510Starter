/**
 * Demonstrates the formatting of decimal values using the DecimalFormat class.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */
void main() {
    int radius;
    double area;
    double circumference;

    Scanner scan = new Scanner(System.in);

    IO.print("Enter the circle's radius: ");
    radius = scan.nextInt();

    area = Math.PI * Math.pow(radius, 2);
    circumference = 2 * Math.PI * radius;

    // Round the output to three decimal places
    DecimalFormat fmt = new DecimalFormat("0.###");
    IO.println("The circle's area: " + fmt.format(area));
    IO.println("The circle's circumference: " + fmt.format(circumference));

    scan.close();
}
