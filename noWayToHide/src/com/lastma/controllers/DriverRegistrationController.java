package com.lastma.controllers;

import com.lastma.dtos.requests.DriverRegisterRequest;
import com.lastma.dtos.responses.RegisterDriverResponse;
import com.lastma.services.DriverService;
import com.lastma.services.DriverServiceImpl;

public class DriverRegistrationController {
    private DriverService driverService = new DriverServiceImpl();

    public RegisterDriverResponse registerDriverController(DriverRegisterRequest request) {
        try {
            return driverService.register(request);
        }
        catch (IllegalArgumentException error){
            System.out.println("Driver Registration Error: " + error.getMessage());
        }
        return null;
    }

}
