import java.text.MessageFormat;

public class BankAccount {
    private final int BANKID = 1234;
    protected String accountNum;
    protected  String owner;
    protected double balance;

    public BankAccount(String accountNum, String owner, double balance) {
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(String accountNum, String owner) {
        this.accountNum = accountNum;
        this.owner = owner;
    }

    public String deposit(double amount) {
        balance += amount;
        return MessageFormat.format("You have successfully deposited ${0}.\nYour new balance is ${1}", amount, balance);
    }

    public String withdraw(double amount) {
        if (balance < amount) {
            return "You're trying to withdraw more than your current balance.";
        }
        balance -= amount;
        return MessageFormat.format("You have successfully withdrawn ${0}.\nYour new balance is ${1}", amount, balance);
    }

    protected String getWholeAccountNum() {
        return MessageFormat.format("{0}/{1}",accountNum, BANKID);
    }

    @Override
    public String toString() {
        return MessageFormat.format("Regular account [{0}, owner: {1}, balance: ${2}]", getWholeAccountNum(), owner, balance);
    }
}
