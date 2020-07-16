package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account acct = new Account();
        assertThat(acct.balance()).isEqualTo(0);
    }

    @Test
    public void depositMultipleAmountstoAcctBalance(){
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }
    @Test
    public void withdrawMultipleAmountsfromAcctBalance(){
        Account account = new Account();
        account.deposit(50);
        account.withdraw(10);
        account.withdraw(20);
        assertThat(account.balance()).isEqualTo(30);
    }
}
