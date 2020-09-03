package dev.craigcarpenter.whatscookin.auth.repo.impl;

import dev.craigcarpenter.whatscookin.auth.repo.UserRepository;
import org.springframework.stereotype.Repository;
import javax.inject.Inject;

import javax.sql.DataSource;

@Repository
public class UserRepositoryPostgresImpl implements UserRepository {

    @Inject
    public UserRepositoryPostgresImpl(DataSource ds) {

    }
}
