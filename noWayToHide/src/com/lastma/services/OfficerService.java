package com.lastma.services;

import com.lastma.dtos.requests.OfficerRegisterRequest;
import com.lastma.dtos.responses.FindOfficerResponse;
import com.lastma.dtos.responses.RegisterOfficerResponse;

public interface OfficerService {
    RegisterOfficerResponse register(OfficerRegisterRequest request);


    FindOfficerResponse findOfficerById(int id);
}
