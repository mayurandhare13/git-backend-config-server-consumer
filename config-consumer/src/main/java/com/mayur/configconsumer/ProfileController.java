package com.mayur.configconsumer;

import com.mayur.configconsumer.model.MembershipConfigurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    MembershipConfigurations membershipConfigurations;

    @RequestMapping(value = "/profile")
    public MembershipConfigurations getConfig() {
        return membershipConfigurations;
    }
}
