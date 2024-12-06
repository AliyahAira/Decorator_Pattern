public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void setBankAccount(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 4.0;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public double showBenefits() {
        return 2.0; // UpSave benefits level
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