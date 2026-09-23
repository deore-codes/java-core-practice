import java.util.*;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMWithdrawalSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: " + balance
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}