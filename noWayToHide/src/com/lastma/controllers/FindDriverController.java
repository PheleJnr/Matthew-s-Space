package com.lastma.controllers;

import com.lastma.dtos.responses.FindDriverResponse;
import com.lastma.services.DriverService;
import com.lastma.services.DriverServiceImpl;

public class FindDriverController {
    private DriverService driverService = new DriverServiceImpl();

    public FindDriverResponse findDriverController(int id) {
        try {
            return driverService.findDriverById(id);
        }
        catch (IllegalArgumentException error) {
            System.out.println("Error Fetching Driver By ID: " + error.getMessage());
        }
        return null;
    }
}


