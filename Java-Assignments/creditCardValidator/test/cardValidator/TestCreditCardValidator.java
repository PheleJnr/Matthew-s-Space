package cardValidator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCreditCardValidator {

    private CreditCardValidator card;

    @BeforeEach
    public void setup() {
        card = new CreditCardValidator();
    }

    @Test

    public void testCardLength(){
        long cardNumber = 5362889646748849L;

        int expectedLength = card.checkCardNumberLength(cardNumber);

        int actualLength = 16;

        assertEquals(actualLength, expectedLength);
    }

    @Test

    public void testThatCardLengthIsBetween13and16(){

        long demoCardNumber = 45578914251123L;

        boolean expectedFlag = card.checkCardLengthValidity(demoCardNumber);

        boolean actualFlag = true;

        assertEquals(actualFlag, expectedFlag);
    }

    @Test
    public void testThatLengthOfCardNumberIsLessThan13_DoesNotWork(){
        long cardNumber = 455789142511L;

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = false;

        assertEquals(actualFlag, expectedFlag);

    }

    @Test
    public void testThatLengthOfCardNumberIsGreaterThan16_DoesNotWork(){
        long cardNumber = 45578914251111111L;

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = false;

        assertEquals(actualFlag, expectedFlag);
    }

    @Test

    public void returnTheNameOfTheCardIfCardNumberIsBetween13and16(){
        long cardNumber = 45578914251123L;

        String expectedBank = card.checkBank(cardNumber);

        String actualBank = "Visa";

        assertEquals(actualBank, expectedBank);
    }

    @Test

    public void testIfTheNameOfTheCardIsMasterCardIfStartingCharacterIs5(){
        long cardNumber = 55578914251123L;

        String expectedBank = card.checkBank(cardNumber);

        String actualBank = "Mastercard";

        assertEquals(actualBank, expectedBank);
    }

    @Test

    public void testIfTheNameOfTheCardIsAmericanExpressIfTheStartingCharactersAre37(){
        long cardNumber = 37578914251123L;

        String  expectedBank = card.checkBank(cardNumber);

        String actualBank = "American Express";

        assertEquals(actualBank, expectedBank);

    }

    @Test

    public void testIfNegativeCardNumbersCannotBeEntered(){

        long cardNumber = -55578914251123L;

        String expectedMessage =  card.checkBank(cardNumber);

        String actualMessage = "Card Number isn't valid";

        assertEquals(actualMessage, expectedMessage);

    }

    @Test

    public void testIfCardNumberIsValid_andIsADiscoverCreditCard(){
        long cardNumber = 654678912345677L;

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = true;

        assertEquals(actualFlag, expectedFlag);

        String expectedBank = card.checkBank(cardNumber);

        String actualBank = "Discover";

        assertEquals(actualBank, expectedBank);
    }

    @Test

    public void testThatForALengthOf14Numbers_AddTheSecondNumbersFromTheRightAndItAddsTheNumbers(){
        long cardNumber = 45625467282764L;

        String expectedBank = card.checkBank(cardNumber);

        assertEquals(expectedBank, card.checkBank(cardNumber));

        long expectedSumOfDigitsInCardNumber = card.sumOfDigitsFromTheRightToLeftAtEvenIndexes(cardNumber);

        long actualSumOfDigitsInCardNumber = 26;

        assertEquals(actualSumOfDigitsInCardNumber, expectedSumOfDigitsInCardNumber);
    }

    @Test

    public void testThatI_checkIfTheLengthOfCardNumberIsValid_Then_I_AddOddIndexesFromTheRightAndTheSumWorks(){
        long cardNumber = 45625467282764L;

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = true;

        assertEquals(actualFlag, expectedFlag);

        long expectedSumOfOddIndexesFromTheRight = card.sumOfDigitsFromRightToLeftAtOddIndexes(cardNumber);

        long actualSumOfOddIndexesFromTheRight = 37;

        assertEquals(actualSumOfOddIndexesFromTheRight, expectedSumOfOddIndexesFromTheRight);
    }

    @Test

    public void testThatTheSumOfNumbersFromTheRightAndTheSumOfOddIndexesWorks(){
        long cardNumber = 45625467282764L;

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = true;

        assertEquals(actualFlag, expectedFlag);

        long expectedSum = card.sumOfTraversalAtIndexes(cardNumber);

        long actualSum =  63;

        assertEquals(actualSum, expectedSum);
    }

    @Test

    public void testThatWhenACardNumberIsInputted_IfTheCardNumberDividedBy10HasNoRemainderTheCardShouldBeValid(){
        long cardNumber = 4388576018410707L;

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = true;

        assertEquals(actualFlag, expectedFlag);

        long expectedSum = card.sumOfTraversalAtIndexes(cardNumber);

        long actualSum = 70;

        assertEquals(actualSum, expectedSum);

        boolean expectedVerifyFlag = card.verifyValidityOfCard(cardNumber);

        boolean actualVerifyFlag = true;

        assertEquals(actualVerifyFlag, expectedVerifyFlag);
    }

    @Test

    public void testThatWhenACardNumberIsInputted_IfTheSumOfTheCardNumberDividedBy10HasA_RemainderTheCardShouldNotBeValid(){

        long cardNumber = 45625467282764L;

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = true;

        assertEquals(actualFlag, expectedFlag);

        long expectedSum = card.sumOfTraversalAtIndexes(cardNumber);

        long actualSum = 63;

        assertEquals(actualSum, expectedSum);

        boolean expectedVerifyFlag = card.verifyValidityOfCard(cardNumber);

        boolean actualVerifyFlag = false;

        assertEquals(actualVerifyFlag, expectedVerifyFlag);
    }

    @Test

    public void testThatWhenIEnterACardNumber_ItChecksTheCardLength_ItChecksTheBankName_ChecksTheSumOfIndividualDigits_ThenChecksIfTheCardNumberIsAValidCardNumber(){
        long cardNumber = 45625467282764L;

        int expectedLength = card.checkCardNumberLength(cardNumber);

        int actualLength = 14;

        assertEquals(actualLength, expectedLength);

        String expectedBankName = card.checkBank(cardNumber);

        String actualBankName = "Visa";

        assertEquals(actualBankName, expectedBankName);

        boolean expectedFlag = card.checkCardLengthValidity(cardNumber);

        boolean actualFlag = true;

        assertEquals(actualFlag, expectedFlag);

        long expectedSum = card.sumOfTraversalAtIndexes(cardNumber);

        long actualSum = 63;

        assertEquals(actualSum, expectedSum);

        boolean expectedVerifyFlag = card.verifyValidityOfCard(cardNumber);

        boolean actualVerifyFlag = false;

        assertEquals(actualVerifyFlag, expectedVerifyFlag);

        String expectedMessageOfValidityOfCard = card.getMessageDisplayingValidity(cardNumber);

        String actualMessageOfValidityOfCard = "The card provider is: " + expectedBankName + " " + " and the length is: " + expectedLength  + " " + "therefore the card has invalid";;

        assertEquals(actualMessageOfValidityOfCard, expectedMessageOfValidityOfCard);
    }


}
