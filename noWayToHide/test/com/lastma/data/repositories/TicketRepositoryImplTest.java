package com.lastma.data.repositories;

import com.lastma.data.models.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryImplTest {

    private TicketRepositoryImpl ticketRepository;
    private Ticket ticket;
    private Ticket ticketTwo;
    private Ticket ticketThree;

    @BeforeEach
    public void setUp() {
        ticketRepository = new TicketRepositoryImpl();
        ticket = new Ticket();
        ticketTwo = new Ticket();
        ticketThree = new Ticket();
    }

    @Test
    public void testThatWhenISaveOneTicket_CountIsOne() {
        ticketRepository.save(ticket);
        assertEquals(1L, ticketRepository.count());
    }

    @Test
    public void testThatWhenIAddTwoTickets_CountIsTwo() {
        assertEquals(0L, ticketRepository.count());
        ticketRepository.save(ticket);
        ticketRepository.save(ticketTwo);
        assertEquals(2L, ticketRepository.count());
    }

    @Test
    public void testThatWhenIAddThreeTickets_CountIsThree(){
        assertEquals(0L, ticketRepository.count());
        ticketRepository.save(ticket);
        ticketRepository.save(ticketTwo);
        ticketRepository.save(ticketThree);
        assertEquals(3L, ticketRepository.count());

    }

    @Test
    public void testThatWhenISaveTicket_IDIsSet() {
        ticketRepository.save(ticket);
        assertEquals("1", ticket.getId());
    }

    @Test
    public void testThatWhenISaveTicketsIGetDifferentIDs() {
        ticketRepository.save(ticket);
        ticketRepository.save(ticketTwo);
        ticketRepository.save(ticketThree);
        assertEquals("1", ticket.getId());
        assertEquals("2", ticketTwo.getId());
        assertEquals("3", ticketThree.getId());
    }

    @Test
    public void testThatWhenIFindByID_TicketIsFound() {
        ticketRepository.save(ticket);
        assertEquals(ticket, ticketRepository.findByID(1));
    }

    @Test
    public void testThatWhenIFindByIDWithThirdTicket_ReturnsCorrectTicket() {
        ticketRepository.save(ticket);
        ticketRepository.save(ticketTwo);
        ticketRepository.save(ticketThree);
        assertEquals(ticketThree, ticketRepository.findByID(3));
    }

    @Test
    public void testThatWhenIFindByIDWithWrongID_ThrowsException() {
        ticketRepository.save(ticket);
        assertThrows(IllegalArgumentException.class, () -> ticketRepository.findByID(65));
    }


}