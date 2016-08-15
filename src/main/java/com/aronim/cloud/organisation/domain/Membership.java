package com.aronim.cloud.organisation.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.List;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-12
 * Time: 16h01
 */
@RelationshipEntity(type = "membership")
public class Membership
{
    private List<String> roles;

    @EndNode
    private Organisation memberOf;

    @StartNode
    private Organisation member;

    public Membership()
    {
    }

    public List<String> getRoles()
    {
        return roles;
    }

    public void setRoles(List<String> roles)
    {
        this.roles = roles;
    }

    public Organisation getMemberOf()
    {
        return memberOf;
    }

    public void setMemberOf(Organisation memberOf)
    {
        this.memberOf = memberOf;
    }

    public Organisation getMember()
    {
        return member;
    }

    public void setMember(Organisation member)
    {
        this.member = member;
    }
}
