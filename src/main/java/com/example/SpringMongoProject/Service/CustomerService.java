package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Customer;
import com.example.SpringMongoProject.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveOrUpdate(Customer customers) {
        customerRepository.save(customers);
    }

    public Iterable<Customer> listAll() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    public Customer getCustomerById(String id) {
       return customerRepository.findById(id).orElse(null);
    }
}
