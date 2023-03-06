package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void testMaxBankAccountsFalse(){
        BankAccount bankAccount1 = new BankAccount("compte1",400);
        BankAccount bankAccount2 = new BankAccount("compte2",500);
        BankAccount bankAccount3 = new BankAccount("compte3",20);
        BankAccount bankAccount4 = new BankAccount("compte4",360);
        BankAccount bankAccount5 = new BankAccount("compte5",800);
        BankAccount bankAccount6 = new BankAccount("compte6",1000);
        List<BankAccount> listeBanques = new ArrayList<>();
        listeBanques.add(bankAccount1);
        listeBanques.add(bankAccount2);
        listeBanques.add(bankAccount3);
        listeBanques.add(bankAccount4);
        listeBanques.add(bankAccount5);
        listeBanques.add(bankAccount6);
        Client unClient = new Client("Parchap","Lucas",listeBanques);
        assertFalse(unClient.maxBankAccounts());
    }
    @Test
    public void testMaxBankAccountsTrue(){
        BankAccount bankAccount1 = new BankAccount("compte1",400);
        BankAccount bankAccount2 = new BankAccount("compte2",500);
        BankAccount bankAccount3 = new BankAccount("compte3",20);
        BankAccount bankAccount4 = new BankAccount("compte4",360);
        BankAccount bankAccount5 = new BankAccount("compte5",800);

        List<BankAccount> listeBanques = new ArrayList<>();
        listeBanques.add(bankAccount1);
        listeBanques.add(bankAccount2);
        listeBanques.add(bankAccount3);
        listeBanques.add(bankAccount4);
        listeBanques.add(bankAccount5);

        Client unClient = new Client("Parchap","Lucas",listeBanques);
        assertTrue(unClient.maxBankAccounts());
    }
}