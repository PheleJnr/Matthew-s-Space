package queue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private Queue myQueue;

    @BeforeEach
    public void setup() {
        myQueue = new Queue();
    }

    @Test
    public void testThatTheQueueIsEmpty(){
        assertTrue(myQueue.isEmpty());
    }
    @Test
    public void testThatWhenIAdd1ElementIntoTheQueue_ItReflectedSuccessfully(){
        assertTrue(myQueue.isEmpty());

        myQueue.add("Matthew");
        assertFalse(myQueue.isEmpty());

    }

    @Test
    public void testThatIAdded5ElementsIntoTheQueue_AndTheyAllReflectedSuccessfully(){
        assertTrue(myQueue.isEmpty());

        myQueue.add("Matthew");
        myQueue.add("Elder");
        myQueue.add("Ayobami");
        myQueue.add("Moses");
        myQueue.add("Ajoba");
        assertFalse(myQueue.isEmpty());
    }


    @Test
    public void testThatICanAddToQueueAnd_TheQueueIsNotEmpty_AndRemoveFromTheQueueAndTheQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
        myQueue.add("Matthew");
        myQueue.add("Elder");
        assertFalse(myQueue.isEmpty());

        assertEquals("Matthew", myQueue.remove());
        assertEquals("Elder", myQueue.remove());

    }

    @Test
    public void testThatWhenQueueIsEmptyAndWhenYouRemoveAnExceptionIsThrown() {
        assertTrue(myQueue.isEmpty());
        assertThrows(IllegalArgumentException.class, () -> myQueue.remove());
    }

    @Test
    public void testThatIfQueueIsEmptyAndTheQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
        myQueue.add("Matthew");
        assertTrue(myQueue.offer("Matthew"));
    }

    @Test
    public void testThatICanRemoveTheHeadOfTheQueueIfOccupied_OrReturnNullIfItIsFull() {
        assertTrue(myQueue.isEmpty());
        myQueue.add("Matthew");
        myQueue.add("Elder");
        assertFalse(myQueue.isEmpty());
        assertEquals(myQueue.poll(), "Matthew");
    }

    @Test
    public void testThatICanCheckTheHeadOfTheElement_AndIfQueueIsEmptyReturnNull() {
        assertTrue(myQueue.isEmpty());
        myQueue.add("Matthew");
        myQueue.add("Elder");
        assertEquals(myQueue.peek(), "Matthew");
    }
}
