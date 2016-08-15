package com.aronim.cloud.organisation;

import com.aronim.cloud.organisation.domain.Membership;
import com.aronim.cloud.organisation.service.OrganisationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * User: Kevin W. Sewell
 * Date: 2015-06-03
 * Time: 15h33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestOrganistaionApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrganisationApplicationTest
{
    @Autowired
    private OrganisationService organisationService;

    @LocalServerPort
    private int port;

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void shouldDoStuffWithOrganisationService() throws Exception
    {
        List<Membership> memberships = organisationService.findMembershipsByUserId("01");

        Assert.assertNotNull(memberships);
    }
}
