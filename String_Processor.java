/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/
import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String text = scanner.nextLine();
            int charIndex = Integer.parseInt(scanner.nextLine());
            int startIndex = Integer.parseInt(scanner.nextLine());
            int endIndex = Integer.parseInt(scanner.nextLine());

            System.out.println("Character found: " + text.charAt(charIndex));
            System.out.println("Substring created: " + text.substring(startIndex, endIndex));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid index handled safely");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
