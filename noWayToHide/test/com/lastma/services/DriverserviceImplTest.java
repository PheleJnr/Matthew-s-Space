package com.lastma.services;

import com.lastma.data.repositories.DriverRepository;
import com.lastma.data.repositories.DriverRepositoryImpl;
import com.lastma.dtos.requests.DriverRegisterRequest;
import com.lastma.dtos.responses.FindDriverResponse;
import com.lastma.dtos.responses.RegisterDriverResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverServiceImplTest {

    private DriverService driverService;
    private DriverRepository driverRepository;
    private String correctPassword = "771596";

    @BeforeEach
    public void setup() {
        driverService = new DriverServiceImpl();
        driverRepository = new DriverRepositoryImpl();
        driverRepository.deleteAll();
    }
    @Test
    public void testThatWhenIRegisterDriver_driverRepositoryCountIsOne() {
        assertEquals(0L, driverRepository.count());
        DriverRegisterRequest request = new DriverRegisterRequest();
        request.setEmail("email");
        request.setFullName("full name");
        request.setPassword(correctPassword);
        driverService.register(request);
        assertEquals(1L, driverRepository.count());
    }
    @Test
    public void testThatWhenIRegisterMoreDrivers_driverRepositoryCountIncreased() {
        assertEquals(0L, driverRepository.count());
        DriverRegisterRequest request = new DriverRegisterRequest();
        request.setEmail("Ayobami@yahoomail");
        request.setFullName("Ayobami");
        request.setPassword(correctPassword);
        driverService.register(request);
        DriverRegisterRequest request2 = new DriverRegisterRequest();
        request2.setEmail("Phele@gmail.com");
        request2.setFullName("Matthew");
        request2.setPassword(correctPassword);
        driverService.register(request2);
        DriverRegisterRequest request3 = new DriverRegisterRequest();
        request3.setEmail("Adegoke@gmail");
        request3.setFullName("Adegoke");
        request3.setPassword(correctPassword);
        driverService.register(request3);
        assertEquals(3L, driverRepository.count());
    }
    @Test
    public void testThatWhenIRegisterDriver_getRegisteredDriverDetailsInTheRepository(){
        DriverRegisterRequest request = new DriverRegisterRequest();
        request.setEmail("Phelelove@gmail.com");
        request.setFullName("Ayobami");
        request.setPassword(correctPassword);

        RegisterDriverResponse registeredDriver = driverService.register(request);
        assertEquals(1L, driverRepository.count());
        assertEquals("Ayobami", registeredDriver.getFullName());
        assertEquals("Phelelove@gmail.com", registeredDriver.getEmail());

    }
    @Test
    public void testThatWhenIRegisterDriver_findDriverById(){
        DriverRegisterRequest request = new DriverRegisterRequest();
        request.setEmail("Ayobami@gmail.com");
        request.setFullName("Matthew");
        request.setPassword(correctPassword);
        RegisterDriverResponse registeredDriver = driverService.register(request);
        FindDriverResponse foundDriver = driverService.findDriverById(1);
        assertEquals(registeredDriver.getFullName(), foundDriver.getFullName());
        assertEquals(registeredDriver.getEmail(), foundDriver.getEmail());

    }
    @Test
    public void testThatWhenIFindNonExistingDriver_throwsException() {
        assertThrows(IllegalArgumentException.class, ()-> driverService.findDriverById(1));
        assertEquals(0L, driverRepository.count());
    }
}