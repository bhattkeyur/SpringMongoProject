package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Customer;
import com.example.SpringMongoProject.Service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/customer")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(value = "/save")
    public String saveCustomer(@RequestBody Customer customers) {
        customerService.saveOrUpdate(customers);
        return customers.get_id();
    }

    @GetMapping(value = "/getAllCustomers")
    public Iterable<Customer> getCustomers() {
        return customerService.listAll();
    }

    @PutMapping(value = "edit/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable (name = "id")String id) {
        customer.set_id(id);
        customerService.saveOrUpdate(customer);
        return customer;
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteStudent(@PathVariable (name = "id")String id) {
        customerService.deleteCustomer(id);
    }

    @RequestMapping(value = "/search/{id}")
    public Customer getStudent(@PathVariable (name = "id")String id) {
        return customerService.getCustomerById(id);
    }
}
