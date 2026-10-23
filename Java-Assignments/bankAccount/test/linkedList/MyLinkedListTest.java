package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void testThatTheLinkedList_IsEmpty() {
        MyLinkedList myList = new MyLinkedList();
        assertTrue(myList.isEmpty());
    }

    @Test
    public void testThatTheSizeOfTheLinkedListIsEmpty(){
        MyLinkedList myList = new MyLinkedList();
        assertEquals(0, myList.size());
    }

    @Test
    public void testThatWhenIAppendToTheLinkedList_ItIsNotEmpty() {
        MyLinkedList myList = new MyLinkedList();
        assertTrue(myList.isEmpty());

        myList.append(20);
        myList.append(30);
        myList.append(40);
        assertFalse(myList.isEmpty());

    }

    @Test
    public void testThatWhenIAppendToTheLinkedList_TheSizeIncreases() {
        MyLinkedList myList = new MyLinkedList();
        assertTrue(myList.isEmpty());
        assertEquals(0, myList.size());

        myList.append(10);
        assertEquals(1, myList.size());

        myList.append(20);
        myList.append(30);
        assertEquals(3, myList.size());

    }

    @Test
    public void testThatWhenIAppendToTheLinkedListAndIPrependToTheList_ItIsPreadded(){
        MyLinkedList myList = new MyLinkedList();
        assertTrue(myList.isEmpty());
        myList.append(10);
        myList.append(20);
        myList.append(30);

        myList.prepend(50);
        assertFalse(myList.isEmpty());
        assertEquals(4, myList.size());
        assertEquals(50, myList.get(0));

    }

    @Test
    public void testThatWhenIAppendAndPrependToTheLinkedListAndInsertedAtAnyIndex_ItReflectedAndSizeIncreases(){
        MyLinkedList myList = new MyLinkedList();
        assertTrue(myList.isEmpty());
        myList.prepend(50);
        myList.append(10);
        myList.append(20);
        myList.append(30);


        myList.insertAt(80, 1);

        assertFalse(myList.isEmpty());
        assertEquals(5, myList.size());
        assertEquals(50, myList.get(0));
        System.out.print(myList.get(0));
    }

    @Test
    public void testThatWhenIPrependAndAppendToTheLinkedListAndRemoveAtAnyIndex_ItReflectedAndSizeDecreases(){
        MyLinkedList myList = new MyLinkedList();
        assertTrue(myList.isEmpty());
        myList.prepend(50);
        myList.append(10);
        myList.append(20);
        myList.append(30);

        myList.RemoveAt(2);

        assertFalse(myList.isEmpty());
        assertEquals(3, myList.size());
        assertEquals(50, myList.get(0));
        System.out.print(myList);

    }
}
