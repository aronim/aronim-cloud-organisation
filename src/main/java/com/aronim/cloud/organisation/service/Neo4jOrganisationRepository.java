package com.aronim.cloud.organisation.service;

import com.aronim.cloud.organisation.domain.Membership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.template.Neo4jTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-12
 * Time: 16h14
 */
@Repository
public class Neo4jOrganisationRepository implements OrganisationRepository
{
    @Autowired
    private Neo4jTemplate neo4jTemplate;

    @Override
    public List<Membership> findMembershipsByUserId(String userId)
    {
        neo4jTemplate.
        return null;
    }
}
