package geopolitical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGeoPolitical {

    @Test
    public void testThatAStateReturnsTheRightGeoPoliticalZone() {
        GeoPolitical zone = new GeoPolitical();
        assertEquals("NORTH CENTRAL", zone.getZone("Kogi"));

    }

    @Test
    void testThatAWrongStateThrowsAnInvalid() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            GeoPolitical.getZone("InvalidState");
        });


//        assertEquals("Invalid State", exception.getMessage());
    }
}

