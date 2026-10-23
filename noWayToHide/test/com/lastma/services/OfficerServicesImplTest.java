package com.lastma.services;

import com.lastma.data.repositories.OfficerRepository;
import com.lastma.data.repositories.OfficerRepositoryImpl;
import com.lastma.dtos.requests.OfficerRegisterRequest;
import com.lastma.dtos.responses.FindOfficerResponse;
import com.lastma.dtos.responses.RegisterOfficerResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerServicesImplTest {
    private OfficerServiceImpl officerService;
    private OfficerRepository officerRepository;
    private String correctPassword = "771596";

    @BeforeEach
    public void setUp() {
        officerService = new OfficerServiceImpl();
        officerRepository = new OfficerRepositoryImpl();
        officerRepository.deleteAll();
    }
    @Test
    public void testThatWhenIRegisterOfficer_OfficerRepositoryCountIsOne() {
        assertEquals(0L, officerRepository.count());
        OfficerRegisterRequest request = new OfficerRegisterRequest();
        request.setFullName("Matthew");
        request.setEmail("Ayobam@email");
        request.setPassword("Ayob123");
        officerService.register(request);
        assertEquals(1L, officerRepository.count());

    }

    @Test
    public void testThatWhenIRegisterMoreOfficer_OfficerRepositoryCountIncreased() {
        assertEquals(0L, officerRepository.count());
        OfficerRegisterRequest request = new OfficerRegisterRequest();
        request.setFullName("Matthew");
        request.setEmail("Ayobam@email");
        request.setPassword("Ayobami");
        officerService.register(request);
        OfficerRegisterRequest request2 = new OfficerRegisterRequest();
        request2.setFullName("Adegoke");
        request2.setEmail("Ayobam@email");
        request2.setPassword("Ayobami");
        officerService.register(request);
        assertEquals(2L, officerRepository.count());
    }


    @Test
    public void testThatWhenIRegisterOfficer_OfficerRepositoryCountIsOneAndFetchRegisteredOfficerDetails(){
        assertEquals(0L, officerRepository.count());
        OfficerRegisterRequest request = new OfficerRegisterRequest();
        request.setFullName("Matthew");
        request.setEmail("Adegoke@gmail.com");
        request.setPassword(correctPassword);
        RegisterOfficerResponse registeredOfficer = officerService.register(request);
        assertEquals(1L, officerRepository.count());
        assertEquals("Matthew", registeredOfficer.getFullName());
        assertEquals("Adegoke@gmail.com", registeredOfficer.getEmail());
    }
    @Test
    public void testThatWhenIRegisterOfficer_findOfficerByIdAndOfficerFound(){
        OfficerRegisterRequest request = new OfficerRegisterRequest();
        request.setFullName("Ayobami");
        request.setEmail("Ayobami@gmail.com");
        request.setPassword(correctPassword);
        RegisterOfficerResponse registeredOfficer = officerService.register(request);
        FindOfficerResponse foundOfficer = officerService.findOfficerById(registeredOfficer.getId());
        assertEquals(foundOfficer.getEmail(), registeredOfficer.getEmail());
        assertEquals(foundOfficer.getFullName(), registeredOfficer.getFullName());
        assertEquals(foundOfficer.getId(), registeredOfficer.getId());
    }
}