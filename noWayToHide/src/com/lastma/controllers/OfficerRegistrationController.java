package com.lastma.controllers;

import com.lastma.dtos.requests.OfficerRegisterRequest;
import com.lastma.dtos.responses.RegisterOfficerResponse;
import com.lastma.services.OfficerService;
import com.lastma.services.OfficerServiceImpl;

public class OfficerRegistrationController {
    private OfficerService officerService = new OfficerServiceImpl();

    public RegisterOfficerResponse register(OfficerRegisterRequest request) {
        try {
            return officerService.register(request);
        } catch (IllegalArgumentException error) {
            System.out.println("Officer Registration Error " + error.getMessage());
        }
        return null;
    }

}
