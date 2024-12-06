public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 1.0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double showBenefits() {
        return 0.0; // Standard benefit level
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + (balance * (getInterestRate() / 100));
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + ", Account Name: " + accountName + ", Balance: " + balance;
    }
}
