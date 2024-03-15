public class Bank {
    private static int id=0;
    Account []accounts = new Account[100];
    public  void createAccount (String name){
        Account acc = new Account(name);
        accounts[id]=acc;
        id++;
    }
    public void deposite (Account acc,double money){
        acc.deposite(money);
    }
    public void withdraw (Account acc,double money){
        acc.withdraw(money);
    }
    public void showBalance (Account acc){
        System.out.println("Balance = "+acc.balance);
//        return  acc.balance;
    }
    public Account getAccountByName (String name) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].name.equals(name))
                return accounts[i];

        }
        return null;
    }

}
