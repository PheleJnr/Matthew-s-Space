package checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    @Test
    public void testThatIHaveAValidProductCreatedSuccessfully(){
        Product product = new Product("Rice", 2, 550.00);
        assertEquals("Rice", product.getName());
        assertEquals(2, product.getQuantity());
        assertEquals(550.00, product.getUnitPrice());

    }

   @Test
   public void testThatTheTotalOnTheSameLineIsCalculatedCorrectly(){
        Product product = new Product("Rice", 2,  550.00);
        assertEquals(1100.00, product.newlineTotal());
   }
}
