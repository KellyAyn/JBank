import java.text.MessageFormat;

public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(String accountNum, String owner, double balance, double interest) {
        super(accountNum, owner, balance);
        this.interest = interest;
    }

    public SavingsAccount(String accountNum, String owner, double interest) {
        super(accountNum, owner);
        this.interest = interest;
    }

    public String payInterest(){
        double interestValue = (interest/100) * balance;
        balance += interestValue;
        return MessageFormat.format("Your account was credit with ${0} in interest. Your new balance is ${1}", interestValue, balance);
    }

    @Override
    public String toString() {
        return MessageFormat.format("Savings account [{0}, owner: {1}, balance: ${2}, interest rate: {3}%]", getWholeAccountNum(), owner, balance, interest);

    }
}
