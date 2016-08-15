package com.aronim.cloud.organisation.service;

import com.aronim.cloud.organisation.domain.Membership;

import java.util.List;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-12
 * Time: 16h09
 */
public interface OrganisationService
{
    List<Membership> findMembershipsByUserId(String userId);
}
