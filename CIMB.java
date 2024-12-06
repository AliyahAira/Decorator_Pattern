public class CIMB {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount();

        account.setAccountNumber(1234);
        account.setAccountName("Juan Dela Cruz");
        account.setBalance(10000.0);

        System.out.println(account.showInfo());
        System.out.println("Account type: " + account.showAccountType());
        System.out.println("Interest rate: " + account.getInterestRate());
        System.out.println("New balance: " + account.computeBalanceWithInterest());
        System.out.println("Benefits: " + getBenefitDescription(account.showBenefits()));

        System.out.println("----------------------");

        GSave gSave = new GSave(account);
        System.out.println(gSave.showInfo());
        System.out.println("Account type: " + gSave.showAccountType());
        System.out.println("Interest rate: " + gSave.getInterestRate());
        System.out.println("New balance: " + gSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + getBenefitDescription(gSave.showBenefits()));

        System.out.println("----------------------");

        UpSave upSave = new UpSave(account);
        System.out.println(upSave.showInfo());
        System.out.println("Account type: " + upSave.showAccountType());
        System.out.println("Interest rate: " + upSave.getInterestRate());
        System.out.println("New balance: " + upSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + getBenefitDescription(upSave.showBenefits()));
    }

    private static String getBenefitDescription(double benefitValue) {
        if (benefitValue == 0.0) {
            return "Standard Savings Account";
        } else if (benefitValue == 1.0) {
            return "Standard Savings Account + GCash Transfer";
        } else if (benefitValue == 2.0) {
            return "Standard Savings Account + With Insurance";
        }
        return "Unknown Benefits";
    }
}
