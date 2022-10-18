import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("2222", "aaaa", 100, 2.6);
        DepositAccount acc2 = new DepositAccount("1111", "bbbb", 9, 2000);
        accounts.add(acc1);
        accounts.add(acc2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the account number: ");
        String accountNum = sc.next();
        System.out.print("\nPlease input the name of the owner: ");
        String ownerName = sc.next();
        System.out.println("\nPlease input the balance: ");
        double balance = sc.nextDouble();
        try {
            BankAccount acc3 = new BankAccount(accountNum, ownerName, balance);
            accounts.add(acc3);
        } catch (Exception e){
            System.out.println("Input error. Try again.");
            throw new RuntimeException(e);
        }

        for (BankAccount account:
             accounts) {
            System.out.println(account);
        }

        System.out.println(acc1.payInterest());
        System.out.println(acc2.deposit(14000));
    }
}