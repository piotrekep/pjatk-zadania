public class Account {
    static double InterestRate;
    private double balance;

    Account(){

    }

    public static void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    void deposit(double deposit){
        balance+=deposit;
    }

    void withdraw(double withdraw){
        balance-=withdraw;
    }

    void addInterest(){
        balance=balance*(1+(InterestRate/100));
    }

    void transfer(Account toAccount, double ammount){
        this.withdraw(ammount);
        toAccount.deposit(ammount);
    }

    double getBallance(){
        return balance;
    }
    
}
