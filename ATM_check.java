/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/
import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double balance = Double.parseDouble(scanner.nextLine());
            double withdrawal = Double.parseDouble(scanner.nextLine());

            if (withdrawal < 0) {
                throw new NegativeAmountException("Invalid Input");
            }
            if (withdrawal > balance) {
                throw new InsufficientBalanceException("Insufficient Balance");
            }

            balance -= withdrawal;
            System.out.println("Transaction Successful");

        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
