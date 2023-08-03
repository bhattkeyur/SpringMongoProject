package com.example.SpringMongoProject.Repository;

import com.example.SpringMongoProject.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
