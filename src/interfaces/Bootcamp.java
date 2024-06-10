package interfaces;

import entities.Customer;

import java.util.ArrayList;

public interface Bootcamp {

    void registerForBootCamp(Customer customer);
    void unregisterFromBootCamp(Customer customer);
    ArrayList<Customer> getAllBootcampRegistrations();

}
