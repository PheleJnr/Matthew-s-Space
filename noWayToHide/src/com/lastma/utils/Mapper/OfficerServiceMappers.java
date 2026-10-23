package com.lastma.utils.Mapper;

import com.lastma.data.models.Officer;
import com.lastma.dtos.requests.OfficerRegisterRequest;
import com.lastma.dtos.responses.FindOfficerResponse;
import com.lastma.dtos.responses.RegisterOfficerResponse;

public class OfficerServiceMappers {
    public static Officer mapOfficer(OfficerRegisterRequest request) {
        Officer officer = new Officer();
        officer.setEmail(request.getEmail());
        officer.setPassword(request.getPassword());
        officer.setFullName(request.getFullName());
        return officer;
    }
    public static RegisterOfficerResponse mapOfficerResponse(Officer officer) {
        RegisterOfficerResponse response = new RegisterOfficerResponse();
        response.setEmail(officer.getEmail());
        response.setFullName(officer.getFullName());
        response.setId(officer.getId());
        return response;
    }

    public static FindOfficerResponse mapFound(Officer officer) {
        FindOfficerResponse response = new FindOfficerResponse();
        response.setEmail(officer.getEmail());
        response.setFullName(officer.getFullName());
        response.setId(officer.getId());
        return response;
    }
}
