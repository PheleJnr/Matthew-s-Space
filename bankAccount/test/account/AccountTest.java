package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private int pin = 1234;
    private int wrongPin = 9999;
    private Account myAccount;

    @BeforeEach
    public void startWith(){

        myAccount = new Account(pin);
    }


    @Test
    public void testThatIHaveAnAccount_AndTheBalanceIsZero(){
        assertEquals(0.0, myAccount.getBalance(pin));
    }

    @Test
    public void testThatIDeposit5k_AndBalanceIs5k(){
        assertEquals(0.0, myAccount.getBalance(pin));

        myAccount.deposit(5000);
        assertEquals(5000, myAccount.getBalance(pin));

    }
    @Test
    public void testThatIDepositNegative5k_AndTheBalanceIsStillZero(){
        assertEquals(0.0, myAccount.getBalance(pin));

        myAccount.deposit(-5000);
        assertEquals(0.0, myAccount.getBalance(pin));
    }

    @Test
    public void testWhenIDeposit5kAndIWithdraw3k_MyBalanceShouldBe2k() {
        myAccount.deposit(5000);
        assertEquals(5000, myAccount.getBalance(pin));

        myAccount.withdraw(3000, pin);
        assertEquals(2000, myAccount.getBalance(pin));

    }

    @Test
    public void testThatIWithdraw3k_AndTheBalanceIsStillZero(){
        myAccount.withdraw(3000, pin);
        assertEquals(0.0, myAccount.getBalance(pin));

    }

    @Test
    public void testThatWhenIWithdrawNegative5k_MyBalanceIsStillZero() {
        myAccount.withdraw(-5000, pin);
        assertEquals(0.0, myAccount.getBalance(pin));
    }

    @Test
    public void testThatWhenCreatingPinDuringAccountCreation_ThePinCannotBeLessThan4Digits(){
        assertThrows(IllegalArgumentException.class, () -> new Account(42));
    }

    @Test
    public void testThatWhenCreatingPinDuringAccountCreation_ThePinCannotBeGreaterThan4Digits(){
        assertThrows(IllegalArgumentException.class, () -> new Account(42456789));

    }

    @Test
    public void testThatWhenCreatingAnAccountWithAValid4DigitsPin_ItCreatesSuccessfully(){
        Account account = new Account(1489);
        assertEquals(0.0, account.getBalance(1489));
    }

    @Test
    public void testThatWhenWhenChangingAccountPinWithShortPin_PinRemainsUnchanged(){
        assertThrows(IllegalArgumentException.class, () -> myAccount.changePin(pin, 42));

        assertEquals(0.0, myAccount.getBalance(pin));
    }

    @Test
    public void testThatTheAccountPinCanBeChangedToANewOneSuccessfully(){
        myAccount.changePin(pin, 7777);
        assertThrows(IllegalArgumentException.class, () -> myAccount.getBalance(pin));

        assertEquals(0.0, myAccount.getBalance(7777));

    }

    @Test
    public void testThatWhenChangingAccountPinWithWrongPin_AccountPinRemainsUnchanged(){
        assertThrows(IllegalArgumentException.class, () -> myAccount.changePin(wrongPin, 7777));

        assertEquals(0.0, myAccount.getBalance(pin));
    }

    @Test
    public void testThatCheckingBalanceWithWrongPin_ThrowsException(){
        myAccount.deposit(5000);
        assertThrows(IllegalArgumentException.class, () -> myAccount.getBalance(wrongPin));
    }

    @Test
    public void testThatWithdrawingWithWrongPin_ThrowsExceptionAndBalanceUnchanged(){
        myAccount.deposit(5000);

        assertThrows(IllegalArgumentException.class, () -> myAccount.withdraw(3000, wrongPin));
        assertEquals(5000, myAccount.getBalance(pin));
    }

}
