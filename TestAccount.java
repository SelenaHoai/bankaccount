public class TestAccount {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        // Deposits
        // System.out.println(myAccount.getSaving());
        myAccount.depositMoney(50,"savings");
        System.out.print("Savings Balance: $" + myAccount.getSaving() + "\n");
        myAccount.depositMoney(100,"checking");
        System.out.print("Checking Balance: $" + myAccount.getChecking() + "\n");

        // Withdrawals
        myAccount.withdrawalMoney(10,"savings");
        System.out.print("Savings Balance: $" + myAccount.getSaving() + "\n");
        myAccount.withdrawalMoney(10,"checking");
        System.out.print("Checking Balance: $" + myAccount.getChecking() + "\n");

        // Account Number
        System.out.print("Account Number: " + myAccount.getAccountNumber() + "\n");
        
    }
}