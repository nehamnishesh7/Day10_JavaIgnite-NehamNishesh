/*
Student Marks System (Safe Input)

Create a program that:

Stores 5 student marks in an array
Takes index input from user
Displays mark
Add Exception Handling:
Handle invalid index
Handle invalid input (if user enters text instead of number)
*/
import java.util.Scanner;

public class StudentMarksSystem {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 90, 88};
        Scanner scanner = new Scanner(System.in);

        try {
            int index = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Student Mark: " + marks[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
