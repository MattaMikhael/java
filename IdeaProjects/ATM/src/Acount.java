package com.company;
public class Acount {
    private int id;
    private double Balance;
    private double annualInterestRate;
    private void dateCreated(){

    }
   public Acount(){
    }
    public Acount(int id,double balance){
        this.id =id;
        this.Balance= balance;
    }
    public void mutator(int id,double balance, double annualInterestRate){
        this.id=id;
        this.Balance =balance;
        this.annualInterestRate=annualInterestRate/100;
    }
    public void accessor(){}

    public double getMonthlyInterestRate(){
        double MonthlyInterestRate= annualInterestRate / 12;
        return MonthlyInterestRate;
    }
    public double getMonthlyInterest(){
        double MonthlyInterest=Balance * this.getMonthlyInterestRate();
        return MonthlyInterest;
    }
    public double withdraw(double withdraw){
        if(withdraw>Balance)
            System.out.println("Unavailable");
        else
        Balance = Balance-withdraw;

        return Balance;
    }
    public double deposit(double deposit){
        Balance = Balance+deposit;
        return Balance;
    }
    }
