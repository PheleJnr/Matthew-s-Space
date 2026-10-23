package checkout;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReceiptTest {

    private Product[] cart;

    @BeforeEach
    public void setUp() {
        cart = new Product[2];
        cart[0] = new Product("Parfait", 2, 2100.00);
        cart[1] = new Product("Rice", 2, 550.00);
    }
    @Test
    public void testThatEmptyCartHasZeroSubTotal() {
        Product[] emptyCart = new Product[0];
        Receipt receipt = new Receipt(emptyCart, 0, 10);
        assertEquals(0.00, receipt.getSubTotal(), 0.001);
    }
    @Test
    public void testThatSubTotalIsCorrectlyCalculated() {
        Receipt receipt = new Receipt(cart, 2, 8);
        assertEquals(5300.00, receipt.getSubTotal());
    }

    @Test
    public void testThatDiscountAmountIsCorrectlyCalculated() {
        Receipt receipt = new Receipt(cart, 2, 8);
        assertEquals(424.00, receipt.getDiscountAmount());
    }

    @Test
    public void testThatVatAmountIsCorrectlyCalculated() {
        Receipt receipt = new Receipt(cart, 2, 8);
        assertEquals(31.8, receipt.getVatAmount(), 0.001);
        System.out.print(receipt.getVatAmount());
    }

    @Test
    public void testThatBillTotalIsCorrectlyCalculated() {
        Receipt receipt = new Receipt(cart, 2, 8);
        assertEquals(4907.8, receipt.getBillTotal(), 0.001);
    }

    @Test
    public void testThatBalanceIsCorrectlyCalculated() {
        Receipt receipt = new Receipt(cart, 2, 8);
        assertEquals(1092.2, receipt.getBalance(6000.00), 0.001);
    }

    @Test
    public void testThatZeroDiscountMeansNoDeduction() {
        Receipt receipt = new Receipt(cart, 2, 0);
        assertEquals(0.00, receipt.getDiscountAmount(), 0.001);
    }
    
}
