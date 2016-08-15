package com.aronim.cloud.organisation.service;

import com.aronim.cloud.organisation.domain.Membership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-12
 * Time: 16h09
 */
@Service
public class OrganisationServiceImpl implements OrganisationService
{
    @Autowired
    private OrganisationRepository organisationRepository;

    @Override
    public List<Membership> findMembershipsByUserId(String userId)
    {
        return organisationRepository.findMembershipsByUserId(userId);
    }
}
