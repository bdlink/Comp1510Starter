/**
 * Demonstrates the use of the NumberFormat class to format output.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */

/** 6% sales tax. */
public static final double TAX_RATE = 0.06;

/**
 * Calculates the final price of a purchased item using values entered by the
 * user.
 */
void main() {

    int quantity;
    double subtotal;
    double tax;
    double totalCost;
    double unitPrice;

    Scanner scan = new Scanner(System.in);

    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
    NumberFormat fmt2 = NumberFormat.getPercentInstance();

    IO.print("Enter the quantity: ");
    quantity = scan.nextInt();

    IO.print("Enter the unit price: ");
    unitPrice = scan.nextDouble();

    subtotal = quantity * unitPrice;
    tax = subtotal * TAX_RATE;
    totalCost = subtotal + tax;

    // Print output with appropriate formatting
    IO.println("Subtotal: " + fmt1.format(subtotal));
    IO.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
    IO.println("Total: " + fmt1.format(totalCost));

    scan.close();
}
