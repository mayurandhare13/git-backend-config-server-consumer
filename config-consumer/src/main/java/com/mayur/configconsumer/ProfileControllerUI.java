package com.mayur.configconsumer;

import com.mayur.configconsumer.model.MembershipConfigurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileControllerUI {

    @Autowired
    MembershipConfigurations membershipConfigurations;

    @RequestMapping(value = "/member-profile")
    public String getConfiguration(Model model) {
        model.addAttribute("model", membershipConfigurations.getDevModel());
        model.addAttribute("min", membershipConfigurations.getMinRentPeriod());

        return "mprofile";
    }
}
