/**
 * Demonstrates the use of the nextLine method of the Scanner class to read a
 * string from the user.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2025
 */
void main() {
    String message;
    Scanner scan = new Scanner(System.in);

    IO.println("Enter a line of text:");

    message = scan.nextLine();

    IO.println("You entered: \"" + message + "\"");

    scan.close();
}
