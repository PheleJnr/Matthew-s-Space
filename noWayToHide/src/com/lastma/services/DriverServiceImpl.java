package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.repositories.DriverRepository;
import com.lastma.data.repositories.DriverRepositoryImpl;
import com.lastma.dtos.requests.DriverRegisterRequest;
import com.lastma.dtos.responses.FindDriverResponse;
import com.lastma.dtos.responses.RegisterDriverResponse;

import static com.lastma.utils.Mapper.DriverServiceMappers.*;

public class DriverServiceImpl implements DriverService{
    private DriverRepository driverRepository = new DriverRepositoryImpl();

    @Override
    public RegisterDriverResponse register(DriverRegisterRequest request) {
        Driver registerDriver = driverRepository.save(registerDriverMap(request));
        return mapRegisteredDriver(registerDriver);
    }

    private void validate(Driver driver) {
        if (driver == null)throw new IllegalArgumentException("Driver not found");
    }

    @Override
    public FindDriverResponse findDriverById(int id) {
        Driver foundDriver = driverRepository.findById(id);
        validate(foundDriver);
        return mapFoundDriver(foundDriver);
    }

}
