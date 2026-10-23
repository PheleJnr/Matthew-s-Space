package com.lastma.data.repositories;

import static org.junit.jupiter.api.Assertions.*;
import com.lastma.data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class VehicleRepositoryImplTest {
    private VehicleRepositoryImpl vehicleRepository;
    private Vehicle vehicle;
    private Vehicle vehicleTwo;

    @BeforeEach
    public void setUp() {
        vehicleRepository = new VehicleRepositoryImpl();
        vehicle = new Vehicle();
        vehicle.setPlateNumber("ABJ-162AB");
        vehicleTwo = new Vehicle();
        vehicleTwo.setPlateNumber("KJA-789KF");
    }

    @Test
    public void testThatWhenISaveOneVehicleInTheRepository_CountIsOne() {
        vehicleRepository.save(vehicle);
        assertEquals(1L, vehicleRepository.count());
    }

    @Test
    public void testThatWhenIAddTwoVehiclesInTheRepository_CountIsTwo() {
        assertEquals(0L, vehicleRepository.count());
        vehicleRepository.save(vehicle);
        vehicleRepository.save(vehicleTwo);
        assertEquals(2L, vehicleRepository.count());
    }

    @Test
    public void testThatWhenIFindByPlateNumber_VehicleIsFound() {
        vehicleRepository.save(vehicle);
        assertEquals(vehicle, vehicleRepository.findPlateNumber("ABJ-162AB"));
    }

    @Test
    public void testThatSavedVehiclesAreFoundByTheirOwnPlateNumbers() {
        vehicleRepository.save(vehicle);
        vehicleRepository.save(vehicleTwo);
        assertEquals(vehicle, vehicleRepository.findPlateNumber("ABJ-162AB"));
        assertEquals(vehicleTwo, vehicleRepository.findPlateNumber("KJA-789KF"));
    }

    @Test
    public void testThatFindByPlateNumberWithWrongPlateNumber_ThrowsException() {
        vehicleRepository.save(vehicle);
        assertThrows(IllegalArgumentException.class, () -> vehicleRepository.findPlateNumber("XXX-000ZZ"));
    }

    @Test
    public void testThatWhenPlateNumberIsSaved_ReturnTrueForSavedVehicle() {
        vehicleRepository.save(vehicle);
        assertTrue(vehicleRepository.plateNumberExists("ABJ-162AB"));
    }

    @Test
    public void testThatWhenPlateNumberIsSaved_ReturnsFalseForUnsavedVehicle() {
        vehicleRepository.save(vehicle);
        assertFalse(vehicleRepository.plateNumberExists("XXX-000ZZ"));
    }

    @Test
    public void testThatFindAllReturnsAllSavedVehicles() {
        vehicleRepository.save(vehicle);
        vehicleRepository.save(vehicleTwo);
        List<Vehicle> vehicles = vehicleRepository.findAll();
        assertEquals(2, vehicles.size());
        assertTrue(vehicles.contains(vehicle));
        assertTrue(vehicles.contains(vehicleTwo));
    }

    @Test
    public void testThatFindAllOnEmptyRepository_ThrowsAnException() {
        assertThrows(IllegalArgumentException.class, () -> vehicleRepository.findAll());
    }

    @Test
    public void testThatWhenIDeleteAVehicle_CountDecreases() {
        vehicleRepository.save(vehicle);
        vehicleRepository.save(vehicleTwo);
        vehicleRepository.delete("ABJ-162AB");
        assertEquals(1L, vehicleRepository.count());
        assertThrows(IllegalArgumentException.class, () -> vehicleRepository.findPlateNumber("ABJ-162AB"));
    }

    @Test
    public void testThatWhenIDeleteNonExistentVehicle_ItThrowsAnException() {
        assertThrows(IllegalArgumentException.class, () -> vehicleRepository.delete("XXX-000ZZ"));
    }

    @Test
    public void testThatWhenIDeleteAll_CountIsZero() {
        vehicleRepository.save(vehicle);
        vehicleRepository.save(vehicleTwo);
        vehicleRepository.deleteAll();
        assertEquals(0L, vehicleRepository.count());
    }

}