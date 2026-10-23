package com.lastma.services;

import com.lastma.data.models.Officer;
import com.lastma.data.repositories.OfficerRepository;
import com.lastma.data.repositories.OfficerRepositoryImpl;
import com.lastma.dtos.requests.OfficerRegisterRequest;
import com.lastma.dtos.responses.FindOfficerResponse;
import com.lastma.dtos.responses.RegisterOfficerResponse;

import static com.lastma.utils.Mapper.OfficerServiceMappers.*;

public class OfficerServiceImpl implements OfficerService {
    private final OfficerRepository officerRepository =  new OfficerRepositoryImpl();

    @Override
    public RegisterOfficerResponse register(OfficerRegisterRequest request) {
        Officer savedOfficer = officerRepository.saveOfficer(mapOfficer(request));
        return mapOfficerResponse(savedOfficer);
    }

    @Override
    public FindOfficerResponse findOfficerById(int id) {
        return mapFound(officerRepository.findById(id));
    }

}
