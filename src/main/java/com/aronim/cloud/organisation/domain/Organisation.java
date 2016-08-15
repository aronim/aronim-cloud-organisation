package com.aronim.cloud.organisation.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-12
 * Time: 15h59
 */
@NodeEntity
public class Organisation
{
    @GraphId
    private String id;

    private String name;

    @Relationship(type="memberships")
    private List<Membership> memberships;

    public Organisation()
    {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Membership> getMemberships()
    {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships)
    {
        this.memberships = memberships;
    }
}
