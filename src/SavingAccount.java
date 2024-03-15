public class SavingAccount extends Account {
    float interestRate ;

    public SavingAccount(String name,float interestRate) {
        super(name);
        this.interestRate = interestRate;
    }
    public  double calculateInterest(){
        return  super.balance*interestRate;
    }
}
