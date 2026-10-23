package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DriverRepositoryImplTest {

    private DriverRepositoryImpl driverRepository;
    private Driver driver;
    private Driver driverTwo;

    @BeforeEach
    void setUp(){
        driverRepository = new DriverRepositoryImpl();
        driver = new Driver();
        driverTwo = new Driver();
    }

    @AfterEach
    void cleanUp(){
        driverRepository.deleteAll();
    }

    @Test
    public void testThatWhenISaveOneDriver_CountIsOne(){
        driverRepository.save(driver);
        assertEquals(1L, driverRepository.count());

    }

    @Test
    public void testThatWhenIAddTwoDrivers_countIsTwo(){
        assertEquals(0L, driverRepository.count());
        Driver driverTwo = new Driver();
        driverRepository.save(driverTwo);
        driverRepository.save(driver);
        assertEquals(2L, driverRepository.count());
    }

   @Test
    public void testThatWhenISaveDriver_IdIsSet(){
        driverRepository.save(driver);
        assertEquals(1, driver.getId());
   }

    @Test
    public void testThatSavedDriversGetDifferentIDs() {
        driverRepository.save(driver);
        driverRepository.save(driverTwo);
        assertEquals(1, driver.getId());
        assertEquals(2, driverTwo.getId());
    }

    @Test
    public void testThatWhenIFindByID_ADriverIsFound() {
        driverRepository.save(driver);
        assertEquals(driver, driverRepository.findById(1));
    }

    @Test
    public void testThatFindByIdWithWrongID_ItThrowsException() {
        driverRepository.save(driver);
        assertThrows(IllegalArgumentException.class, () -> driverRepository.findById(99));
    }

    @Test
    public void testThatFindAllReturnsAllTheSavedDrivers() {
        driverRepository.save(driver);
        driverRepository.save(driverTwo);
        List<Driver> drivers = driverRepository.findAll();
        assertEquals(2, drivers.size());
        assertTrue(drivers.contains(driver));
        assertTrue(drivers.contains(driverTwo));
    }

    @Test
    public void testThatFindAllOnAnEmptyRepository_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverRepository.findAll());
    }

    @Test
    public void testThatWhenIDeleteDriverFromTheRepository_CountDecreases() {
        driverRepository.save(driver);
        driverRepository.save(driverTwo);
        driverRepository.delete(1);
        assertEquals(1L, driverRepository.count());
        assertThrows(IllegalArgumentException.class, () -> driverRepository.findById(1));
    }

    @Test
    public void testThatDeletingNonExistentDriverInTheRepository_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverRepository.delete(5));
    }

    @Test
    public void testThatWhenIDeleteAllInTheRepository_CountIsZero() {
        driverRepository.save(driver);
        driverRepository.save(driverTwo);
        driverRepository.deleteAll();
        assertEquals(0L, driverRepository.count());
    }

}