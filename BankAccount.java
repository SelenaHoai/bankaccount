import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int numberOfAccounts=0;
    private static double totalAmountOfMoney=0;

// CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance=0;
        this.savingsBalance=0;
        numberOfAccounts++;
        this.accountNumber=createAccountNumber();
    }

    public BankAccount(int checking1, int saving1){
        this.checkingBalance=checking1;
        this.savingsBalance=saving1;
        numberOfAccounts++;
        this.accountNumber=createAccountNumber();
        totalAmountOfMoney+=checking1+saving1;
    }

// GETTER (read) & SETTER (write)
    public double getChecking(){
        return this.checkingBalance;
    }

// same as depositMoney function
    // public void setChecking(double checkingBalance){
    //     this.checkingBalance=checkingBalance;
    // }

    public double getSaving(){
        return this.savingsBalance;
    
    }

// same as depositMoney function
    // public void setSaving(double savingsBalance){
    //     this.savingsBalance=savingsBalance;
    // }

    public void depositMoney(double amount, String location) {
        if (location.equals("checking")){
            this.checkingBalance += amount;
            totalAmountOfMoney += amount;
        } else if(location.equals("savings")){
            this.savingsBalance += amount;
            totalAmountOfMoney += amount;
        } else{
            System.out.println("Unable to deposit, account invalid!");
        }
    }

    public void withdrawalMoney(double amount, String location) {
        if (location.equals("checking")){
            if(this.checkingBalance < amount){
                System.out.println("insufficient funds!");
            } else{
                this.checkingBalance -= amount;
                totalAmountOfMoney -= amount;
            }
        }else if(location.equals("savings")){
            if(this.savingsBalance < amount){
                System.out.println("insufficient funds!");
            } else{
                this.savingsBalance -= amount;
                totalAmountOfMoney -= amount;
            }
        } else{
            System.out.println("Unable to withdrawal, amount invalid!");
        }
    }

    public void accountBalance(){
        System.out.println("Checking account balance: " + this.checkingBalance + "\n Saving account balance: " + this.savingsBalance);
    }

    private String createAccountNumber(){
        Random randomNumber = new Random();
        String accountNumber = "";
        for(int i=1;i<=10; i++){
            accountNumber += randomNumber.nextInt(10);
        }
        return accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
}