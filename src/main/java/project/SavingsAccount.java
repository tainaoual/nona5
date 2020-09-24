


package project;

public class SavingsAccount<v, balance, deposit, intereintst> {

    private double balance;
    private int accountNumber;
    private double interestRate;



    public SavingsAccount(double balance, int accountNumber, double interestRate) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;


    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInterestRate() {
        return interestRate;
    }


    public void withdraw(double withdraw) {
        if (balance - withdraw >= 0) {
            balance -= withdraw;
        }
    }


    public void deposit(double deposit) {
        balance +=deposit;

        }


    public void accrueInterest() {

        balance=(balance * interestRate) + balance;




        }
    }









//
//
//package project;
//public class SavingsAccount {
//    private final double balance;
//    private final int accountNumber;
//    private final double interestRate;
//    private double deposit;
//    private double withdraw;
//    private double interest;
//    public SavingsAccount(double balance, int accountNumber, double interestRate) {
//        this.balance = balance;
//        this.accountNumber = accountNumber;
//        this.interestRate = interestRate;
//    }
//    public double getBalance() {
//        if (deposit > 0) {
//            return (balance + deposit + interest);
//        } else if (withdraw > 0) {
//            return (balance - withdraw);
//        } else if (interest > 0) {
//            return (balance + deposit + interest);
//        }
//        return balance;
//    }
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//    public double getInterestRate() {
//        return interestRate;
//    }
//    public void deposit(double v) {
//        deposit = v;
//    }
//    public void withdraw(double v) {
//        withdraw = v;
//        if (balance - withdraw <= 0) {
//            withdraw = 0;
//        }
//    }
//    public void accrueInterest() {
//        interest = balance * interestRate;
//        if (deposit > 0) {
//            interest = (balance + deposit) * interestRate + balance;
//        }
//    }

