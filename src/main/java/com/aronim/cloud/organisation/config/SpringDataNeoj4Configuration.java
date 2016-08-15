package com.aronim.cloud.organisation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-12
 * Time: 16h18
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "com.aronim.cloud.organisation.domain")
public class SpringDataNeoj4Configuration
{
}
