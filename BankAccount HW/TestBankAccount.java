public class TestBankAccount {
    public static void main (String[]args){
        BankAccount randyAccount = new BankAccount();
        randyAccount.addMoney(3000, "checking");
        randyAccount.addMoney(20, "checking");
        randyAccount.addMoney(5, "saving");
        randyAccount.takeOutmoney(23000, "checking");
        randyAccount.takeOutmoney(2000, "saving");
        BankAccount jackAccount = new BankAccount();
        jackAccount.addMoney(200,"checking");
        jackAccount.addMoney(300, "saving");
        jackAccount.takeOutmoney(100, "checking");
        jackAccount.takeOutmoney(100, "saving");
        System.out.println(randyAccount .getcheckingAccountbalance());
        System.out.println(randyAccount .getsavingAccountbalance());
        System.out.println(jackAccount .getcheckingAccountbalance());
        System.out.println(jackAccount .getsavingAccountbalance());
        
    }
}