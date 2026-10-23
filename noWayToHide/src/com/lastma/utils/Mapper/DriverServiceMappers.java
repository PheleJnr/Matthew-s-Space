package com.lastma.utils.Mapper;

import com.lastma.data.models.Driver;
import com.lastma.dtos.requests.DriverRegisterRequest;
import com.lastma.dtos.responses.FindDriverResponse;
import com.lastma.dtos.responses.RegisterDriverResponse;

public class DriverServiceMappers {
    public static Driver registerDriverMap(DriverRegisterRequest request) {
        Driver driver = new Driver();
        driver.setFullName(request.getFullName());
        driver.setEmail(request.getEmail());

        return driver;
    }

    public static RegisterDriverResponse mapRegisteredDriver(Driver driver) {
        RegisterDriverResponse response = new RegisterDriverResponse();
        response.setFullName(driver.getFullName());
        response.setEmail(driver.getEmail());

        return response;
    }
    public static FindDriverResponse mapFoundDriver(Driver driver) {
        FindDriverResponse response = new FindDriverResponse();
        response.setFullName(driver.getFullName());
        response.setEmail(driver.getEmail());
        response.setId(driver.getId());
        return response;
    }

}
