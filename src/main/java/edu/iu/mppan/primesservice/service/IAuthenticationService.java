package edu.iu.mppan.primesservice.service;

import edu.iu.mppan.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
//    boolean register(Customer customer) throws IOException;
}
