import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner userInput = new Scanner(System.in);
        boolean flagToBreak = false;
//        create account
        while (true) {
            if(flagToBreak) {
                System.out.println("Thank you");
                break;
            }
            System.out.println("Do you have an account ?");
            System.out.println("Write yes or no");
            String choice = userInput.next();
            switch (choice) {
                case "yes":
                    System.out.println("Please enter your name");
                    choice=userInput.next();
                   Account acc =  bank.getAccountByName(choice);
                   if(acc==null){
                       System.out.println("sorry, no account with this name");
                       break;
                   }
//                deposite show withdraw
                    System.out.println("To show balance enter 1");
                    System.out.println("To deposit  enter 2");
                    System.out.println("To withdraw  enter 3");
                    choice=userInput.next();
                    if(choice.equals("1"))
                        bank.showBalance(acc);
                    else if(choice.equals("2")) {
                        System.out.println("Please enter amount of money");
                        double money = userInput.nextDouble();
                        bank.deposite(acc, money);
                    }
                    else if(choice.equals("3")) {
                        System.out.println("Please enter amount of money");
                        double money = userInput.nextDouble();
                        bank.withdraw(acc, money);
                    }
                    else
                        System.out.println("Sorry, invalid operation");
                    break;
                case "no":
                    System.out.println("Do you want to create a new account ?");
                    System.out.println("Write yes or no");
                    choice = userInput.next();
                    switch (choice) {
                        case "yes":
                            System.out.println("Enter account name");
                            String name = userInput.next();
                            bank.createAccount(name);
//                    create account
                            break;
                        case "no":
                            flagToBreak = true;
                            break;

                    }

            }

        }
    }
}