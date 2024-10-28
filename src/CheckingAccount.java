public class CheckingAccount extends BankAccount{
    public CheckingAccount (int accountNumber, double balance){
        super(accountNumber,balance);
    }
    public String getInfo (){
        return "Balance is: " +getBalance() + "The account Number is: "+getAccountNumber();
    }
    @Override
    public double withdraw(double amount){
        return 0;
    }
    @Override
    public double deposit(double amount){
        return 0;
    }

}
