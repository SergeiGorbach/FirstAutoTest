package test.java;

import com.company.BankAccount;
import org.junit.*;

public class TestClass {
    private  BankAccount bankAccount;

    @Before public void setUp(){
        bankAccount = new BankAccount();
    }

    @Test public void firstTest (){
        double sum = 100;
        bankAccount.setBalance(sum);
        Assert.assertEquals(sum, bankAccount.getBalance(), 0.001);
    }

    @Test public void checkDebitMethod(){
        bankAccount.setBalance(100);
        bankAccount.debit(50);
        bankAccount.getBalance();
        Assert.assertEquals(50, bankAccount.getBalance(), 00.1);
    }
}
