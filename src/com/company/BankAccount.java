package com.company;

import java.util.Scanner;

public class BankAccount {

    /*Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
    Реализовать в классе методы setBalance() который будет задавать баланс ,
    credit() метод должен начислять средства на счет, debit() - снимать средтва со  счета.
    Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение : “Сумма снятия больше чем остаок на счету!” .
    Создать обьект класса и проверить работу программы. */

    String accountNumber;
    static double balance;

    public float setBalance(double balance) {
        this.balance = balance;
        return 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void credit (double creditAmount){
        /*credit() метод должен начислять средства на счет*/
        System.out.println("Текущий баланс: " + balance);
        System.out.println("Введите сумму пополнения: ");
        Scanner scanner = new Scanner(System.in);
        creditAmount = scanner.nextInt();
         balance = balance + creditAmount;
        System.out.println("Баланс после пополнения: " + balance);
    }

    public double debit(double debitAmount){
        /*debit() - снимать средтва со  счета*/
        System.out.println("Текущий баланс: " + balance);
        System.out.println("Введите сумму перевода: ");
        Scanner scanner = new Scanner(System.in);
        debitAmount = scanner.nextInt();
        if (balance <= debitAmount){
            System.out.println("Сумма снятия больше чем остаок на счету! Вашь текущий баланс: "+this.getBalance());
        }
        else {
            balance = balance - debitAmount;
            System.out.println("4 " + balance);
        }
        return balance;
    }

}