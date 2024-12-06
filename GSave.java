public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void setBankAccount(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 2.5;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public double showBenefits() {
        return 1.0; // GSave benefits level
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * (getInterestRate() / 100));
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}