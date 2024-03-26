package edu.iu.mppan.primesservice.repository;

import edu.iu.mppan.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationFileRepository {
    boolean save(Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;

}
