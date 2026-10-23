package cardValidator;

public class CreditCardValidator {

    public int checkCardNumberLength(long cardNumber){

        int lengthCounter;

        String cardNumberToString = String.valueOf(cardNumber);

        lengthCounter = cardNumberToString.length();

        return lengthCounter;
    }

    public boolean checkCardLengthValidity(long cardNumber) {

        boolean valid;

        int lengthOfCard = checkCardNumberLength(cardNumber);

        if(lengthOfCard >= 13 &&  lengthOfCard <= 16) {
            valid = true;
        }
        else{
            valid = false;
        }

        return valid;
    }

    public String checkBank(long cardNumber) {

        String bankName = "";

        boolean lengthOfCard = checkCardLengthValidity(cardNumber);

        String conversionOfCardToString = String.valueOf(cardNumber);

        char firstCharacter = conversionOfCardToString.charAt(0);

        char secondCharacter = conversionOfCardToString.charAt(1);
        if (lengthOfCard && cardNumber > 0 ) {

            if (firstCharacter == '4') {
                bankName = "Visa";

            } else if (firstCharacter == '5') {
                bankName = "Mastercard";

            } else if (firstCharacter == '3' && secondCharacter == '7') {
                bankName = "American Express";

            } else if (firstCharacter == '6') {
                bankName = "Discover";

            }
        } else {
            bankName = "Card Number isn't valid";

        }
        return bankName;
    }

    public long sumOfDigitsFromTheRightToLeftAtEvenIndexes(long cardNumber) {
        long sum = 0;

        String iterableCardNumber = String.valueOf(cardNumber);

        int digitString = 0;

        for (int index = iterableCardNumber.length() - 2; index >= 0; index -= 2) {
            digitString = Character.getNumericValue(iterableCardNumber.charAt(index));

            if (digitString > 4) {
                digitString = digitString * 2 - 9;

            } else {
                digitString = digitString * 2;

            }
            sum += digitString;

        }
        return sum;
    }


    public long sumOfDigitsFromRightToLeftAtOddIndexes(long cardNumber) {
        long sum = 0;

        String iterableCardNumber = String.valueOf(cardNumber);

        int digitString = 0;

        for (int index = iterableCardNumber.length() - 1; index >= 0; index -= 2) {
            digitString = Character.getNumericValue(iterableCardNumber.charAt(index));
            sum += digitString;
        }


        return sum;
    }

    public long sumOfTraversalAtIndexes(long cardNumber) {
        long sum = 0;

        sum = sumOfDigitsFromRightToLeftAtOddIndexes(cardNumber) + sumOfDigitsFromTheRightToLeftAtEvenIndexes(cardNumber);

        return sum;
    }

    public boolean verifyValidityOfCard(long cardNumber) {
        return sumOfTraversalAtIndexes(cardNumber) % 10 == 0;
    }

    public String getMessageDisplayingValidity(long cardNumber) {

        String message = "";

        int lengthOfCard =  checkCardNumberLength(cardNumber);

        boolean verifyCard = verifyValidityOfCard(cardNumber);

        if(lengthOfCard >= 13 &&  lengthOfCard <= 16) {
            if(verifyCard){
                message = "The card provider is: " + checkBank(cardNumber) + "and the length is: " + lengthOfCard + "therefore the card has valid";
            }
            else {
                message = "The card provider is: " + checkBank(cardNumber) + " " + " and the length is: " + lengthOfCard + " " + "therefore the card has invalid";
            }
        }
        else{
            message = "Invalid Input";
        }
        return message;
    }
}
