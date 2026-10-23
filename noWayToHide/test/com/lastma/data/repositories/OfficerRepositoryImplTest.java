package com.lastma.data.repositories;

import com.lastma.data.models.Officer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OfficerRepositoryImplTest {

    private OfficerRepositoryImpl officerRepository;
    private Officer officer;
    private Officer officerTwo;

    @BeforeEach
    public void setUp() {
        officerRepository = new OfficerRepositoryImpl();
        officer = new Officer();
        officerTwo = new Officer();
    }

    @Test
    public void testThatWhenISaveOneOfficerInTheRepository_CountIsOne() {
        officerRepository.saveOfficer(officer);
        assertEquals(1L, officerRepository.count());
    }

    @Test
    public void testThatWhenIAddTwoOfficersIntoTheRepository_CountIsTwo() {
        assertEquals(0L, officerRepository.count());
        officerRepository.saveOfficer(officer);
        officerRepository.saveOfficer(officerTwo);
        assertEquals(2L, officerRepository.count());
    }

    @Test
    public void testThatWhenISaveOfficer_IDIsSet() {
        officerRepository.saveOfficer(officer);
        assertEquals(1, officer.getId());
    }

    @Test
    public void testThatSavedOfficersGetDifferentIDsInTheRepository() {
        officerRepository.saveOfficer(officer);
        officerRepository.saveOfficer(officerTwo);
        assertEquals(1, officer.getId());
        assertEquals(2, officerTwo.getId());
    }

    @Test
    public void testThatWhenIFindByID_OfficerIsFoundInTheRepository() {
        officerRepository.saveOfficer(officer);
        assertEquals(officer, officerRepository.findById(1));
    }

    @Test
    public void testThatFindByIdWithWrongID_ThrowsException() {
        officerRepository.saveOfficer(officer);
        assertThrows(IllegalArgumentException.class, () -> officerRepository.findById(99));
    }

    @Test
    public void testThatFindAllReturnsAllSavedOfficersInTheRepository() {
        officerRepository.saveOfficer(officer);
        officerRepository.saveOfficer(officerTwo);
        List<Officer> officers = officerRepository.findAll();
        assertEquals(2, officers.size());
        assertTrue(officers.contains(officer));
        assertTrue(officers.contains(officerTwo));
    }

    @Test
    public void testThatFindAllOnEmptyRepository_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> officerRepository.findAll());
    }

    @Test
    public void testThatWhenIDeleteOfficerInTheRepository_CountDecreases() {
        officerRepository.saveOfficer(officer);
        officerRepository.saveOfficer(officerTwo);
        officerRepository.delete(1);
        assertEquals(1L, officerRepository.count());
        assertThrows(IllegalArgumentException.class, () -> officerRepository.findById(1));
    }

    @Test
    public void testThatDeletingNonExistentOfficerInTheRepository_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> officerRepository.delete(5));
    }

    @Test
    public void testThatWhenIDeleteAllInTheRepository_CountIsZero() {
        officerRepository.saveOfficer(officer);
        officerRepository.saveOfficer(officerTwo);
        officerRepository.deleteAll();
        assertEquals(0L, officerRepository.count());
    }

}