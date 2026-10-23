package com.lastma.controllers;

import com.lastma.dtos.responses.FindOfficerResponse;
import com.lastma.services.OfficerService;
import com.lastma.services.OfficerServiceImpl;

public class FindOfficerController {
    private OfficerService officerService = new OfficerServiceImpl();

    public FindOfficerResponse findOfficerController(int id) {
        try {
            return officerService.findOfficerById(id);
        }
        catch (IllegalArgumentException error) {
            System.out.println("Error Fetching Officer By ID " + error.getMessage());
        }
        return null;
    }

}
