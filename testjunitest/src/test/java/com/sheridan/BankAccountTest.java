package com.sheridan;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.*;
@DisplayName("BankAccountTest")
public class BankAccountTest {
    @Test
    @DisplayName("withderaw test $400, initial $500, min -$1000")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(400);
        assertEquals(100, bankAccount.getBalance(), 0.001);
    }
    @Test
    @DisplayName("deposit test $200, initial $500, min -$1000")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.deposit(200);
        assertEquals(700, bankAccount.getBalance(), 0.001);
    }

    @Nested
    class WhenBalanceGoesBelowMinimum {
        @Test
        public void testWithdrawBelowMinimum() {
            BankAccount bankAccount = new BankAccount(0, 0);
            assertThrows(RuntimeException.class, ()-> bankAccount.withdraw(100));
        }
    }
}
