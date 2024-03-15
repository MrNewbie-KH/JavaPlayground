public class Account {
    static  int counter =0;
    int number;
    String name;
    double balance;

    public Account( String name) {
        this.number=counter+1;
        counter++;
        this.name = name;
    }
    public void deposite (double amount){
        this.balance=this.balance+amount;
    }
    public void withdraw (double amount){
        if(this.balance>=amount) {
            this.balance = this.balance - amount;
            System.out.println("Your balance now "+balance);
        }
        else {
            System.out.println("Not enough money, you have : "+balance);
        }
    }
}
