import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaWahalaOrderTest {

    @Test

    public void testThatGetNumberOfSlicesPerBoxReturnsCorrectSlices() {

        int result = PizzaWahala.getNumberOfSlicesPerBox("Odogwu");

        int expected = 12;

        assertEquals(expected, result);

    }


    @Test

    public void testThatGetNumberOfSlicesPerBoxReturnsZeroForWrongCase() {

        int result = PizzaWahala.getNumberOfSlicesPerBox("odogwu");

        int expected = 0;

        assertEquals(expected, result);
    }

    
    @Test

    public void testThatGetPriceOfBoxReturnsCorrectPrice() {

        int result = Pizzawahala.getPriceOfBox("Odogwu");

        int expected = 5200;

        assertEquals(expected, result);
    }


    @Test

    public void testThatCalculateBoxesReturnsExactBoxesWhenEvenlyDivisible() {

        int result = PizzaWahalaOrder.calculateBoxes(36, 12);

        int expected = 3;

        assertEquals(expected, result);
    }

    
    @Test

    public void testThatCalculateBoxesRoundsUpWhenNotEvenlyDivisible() {

        int result = PizzaWahalaOrder.calculateBoxes(45, 12);

        int expected = 4;

        assertEquals(expected, result);
    }


    @Test

    public void testThatCalculateLeftoverReturnsCorrectSlicesLeft() {

        int result = PizzaWahalaOrder.calculateLeftover(45, 12);

        int expected = 3;

        assertEquals(expected, result);
    }


    @Test

    public void testThatCalculateTotalPriceReturnsCorrectTotalPrice() {

        int result = PizzaWahalaOrder.calculateTotalPrice(4, 5200);

        int expected = 20800;

        assertEquals(expected, result);
    }




}













}
