//Create a BankAccount class.

class BankAccount{
    //The class should have the following attributes: (double) checking balance, (double) savings balance.
    private double checkingAccount;
    private double savingAccount;
    //Create a class member (static) that has the number of accounts created thus far.
    public static int accounts=0;
    //Create a class member (static) that tracks the total amount of money stored in every account created.
    public  double totalAmount;
    
    public BankAccount() {
        //In the constructor, be sure to increment the account count.
        BankAccount.accounts+=1;

        //Create a getter method for the user's checking account balance.
    }
    public void addMoney(double amount, String account){
        if (account == "checking") {
            this.checkingAccount += amount;
        }
        else {
            this.savingAccount+= amount;
        }
            this.totalAmount += amount;
    }
    //Create a method to withdraw money from one balance. Do not allow them to withdraw money 
    //if there are insufficient funds.
    public void takeOutmoney(double amount, String account){
        if (account == "checking") {
            if (amount> this.checkingAccount){
                System.out.println ("Not enough Mula Baby!");
                return;
            }
            this.checkingAccount -= amount;
        }
        else {
            if (amount> this.savingAccount){
                System.out.println ("Not enough Mula Baby!");
                return;
            }
            this.savingAccount-= amount;
        }
            this.totalAmount -= amount;
    }
    //Create a getter method for the user's checking account balance.
    public double getcheckingAccountbalance() {
        return this.checkingAccount;
    }
    //Create a getter method for the user's saving account balance.
    public double getsavingAccountbalance() {
        return this.savingAccount;
    }

}