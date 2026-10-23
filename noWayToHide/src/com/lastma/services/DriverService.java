package com.lastma.services;

import com.lastma.dtos.requests.DriverRegisterRequest;
import com.lastma.dtos.responses.FindDriverResponse;
import com.lastma.dtos.responses.RegisterDriverResponse;

public interface DriverService {
    RegisterDriverResponse register(DriverRegisterRequest request);
    FindDriverResponse findDriverById(int id);


}
