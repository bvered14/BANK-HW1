public class PremiumAccount implements IAccount {

    //State
    int accountNumber;
    double accountBalance;

    //Constructor
    public PremiumAccount(int accountNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    //Behaviour
    @Override
    public void Deposit(double amount){
        this.accountBalance = this.accountBalance + amount;
    }
    @Override
    public double Withdraw(double amount){
        this.accountBalance = this.accountBalance - amount;
        return amount;
    }
    @Override
    public double GetCurrentBalance(){
        return this.accountBalance;
    }

    @Override
    public int GetAccountNumber(){
        return this.accountNumber;
    }
}