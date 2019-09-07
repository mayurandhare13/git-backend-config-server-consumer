package com.mayur.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MembershipConfigurations {

    @Autowired
    Environment environment;

    public String getDevModel() {
        return environment.getProperty("vehicle.default.model");
    }

    public String getMinRentPeriod() {
        return environment.getProperty("member.rent.min");
    }
}
