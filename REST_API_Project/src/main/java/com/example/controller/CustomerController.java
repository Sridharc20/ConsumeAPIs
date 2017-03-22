/**
 * 
 */
package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer;

/**
 * @author Sridhar.C
 *
 */
@RestController
public class CustomerController {

	@Autowired
	private CustomerService cs;

	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return cs.getCustomers();
	}

	@RequestMapping("/customers/{firstName}")
	public Customer getCustomer(@PathVariable String firstName) {
		return cs.getCustomer(firstName);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@RequestBody Customer c) {
		cs.addCustomer(c);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{firstName}")
	public void updateCustomer(@RequestBody Customer c, @PathVariable String firstName) {
		cs.updateCustomer(firstName, c);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{firstName}")
	public void deleteCustomer(@PathVariable String firstName) {
		cs.deleteCustomer(firstName);

	}

}
