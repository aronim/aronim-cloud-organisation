package com.aronim.cloud.organisation.controller;

import com.aronim.cloud.common.security.AronimUserDetails;
import com.aronim.cloud.organisation.domain.Membership;
import com.aronim.cloud.organisation.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-12
 * Time: 16h07
 */
@RestController
public class OrganisationServiceController
{
    @Autowired
    private OrganisationService organisationService;

    @RequestMapping("/api/organisations/mine")
    public List<Membership> register(Authentication authentication)
    {
        AronimUserDetails userDetails = (AronimUserDetails) authentication.getDetails();
        String userId = userDetails.getId();

        return organisationService.findMembershipsByUserId(userId);
    }
}
