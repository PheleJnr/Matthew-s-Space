package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackTest {

    private Stack myStack;

    @BeforeEach
    public void startWith(){
        myStack = new Stack();
    }

    @Test
    public void testThatStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatIPushXAndTheStackIsNotEmpty(){
        assertTrue(myStack.isEmpty());

        myStack.push("Matthew");
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testThatIPushXAndPopTheStackIsEmpty(){
        myStack.push("Matthew");
        assertFalse(myStack.isEmpty());
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatIPushXYAndIPopYX(){
        assertTrue(myStack.isEmpty());
        myStack.push("Matthew");
        myStack.push("Ayobami");
        assertFalse(myStack.isEmpty());

       assertEquals("Ayobami", myStack.pop());
       assertEquals("Matthew", myStack.pop());
       assertTrue(myStack.isEmpty());

    }

    @Test
    public void testThatPopEmptyStackThrowsException(){
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class, myStack::pop);
    }

    @Test
    public void testThatIPush3ElementsAndPeekToCheckTheLastElements(){
        assertTrue(myStack.isEmpty());
        myStack.push("Matthew");
        myStack.push("Ayobami");
        myStack.push("Ogooluwa");

        myStack.peek();
        assertEquals("Ogooluwa", myStack.peek());
    }

    @Test
    public void testThatIPush3ElementsAndPop1AndCheckTheLastElementsOnTop(){
        assertTrue(myStack.isEmpty());
        myStack.push("Matthew");
        myStack.push("Ayobami");
        myStack.push("Ogooluwa");

        myStack.pop();
        assertEquals("Ayobami", myStack.peek());
    }

    @Test
    public void testThatISearchForXAndReturnsPositionInStack(){
        assertTrue(myStack.isEmpty());
        myStack.push("Orowusi");
        myStack.push("Ayobami");
        myStack.push("Ogooluwa");

        assertEquals(1, myStack.search("Ayobami"));
    }

    @Test
    public void testThatSearchForYReturnsMinus1_YNotInTheStack(){
        assertTrue(myStack.isEmpty());
        myStack.push("Orowusi");
        myStack.push("Ayobami");

        assertEquals(-1, myStack.search("Ogooluwa"));

    }
}
