package com.company;

public class Main {

    public static void main(String[] args) {
        Acount aco;
        aco = new Acount();
        aco.mutator(1122,20000,4.5);
        System.out.println(aco.withdraw(25000));
        System.out.println(aco.deposit(3000));
        System.out.println(aco.getMonthlyInterest());

        System.out.println();
    }
}
