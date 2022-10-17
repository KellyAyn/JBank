import java.text.MessageFormat;

public class DepositAccount extends BankAccount {
    private double debet;

    public DepositAccount(String accountNum, String owner, double balance, double debet) {
        super(accountNum, owner, balance);
        this.debet = debet;
    }

    public DepositAccount(String accountNum, String owner, double debet) {
        super(accountNum, owner);
        this.debet = debet;
    }

    @Override
    public String withdraw(double amount) {
        if ((balance - amount) < debet){
            return "Withdrawal would exceed debet limits. Not enough balance.";
        }
        balance -= amount;
        return MessageFormat.format("You have successfully withdrawn ${0}.\nYour new balance is ${1}", amount, balance);

    }

    @Override
    public String toString() {
        return MessageFormat.format("Deposit account [{0}, owner: {1}, balance: ${2}, debet: {3}]", getWholeAccountNum(), owner, balance, debet);

    }
}
