/**
 * 
 */
package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Customer;

/**
 * @author Sridhar.C
 *
 */
@Service
public class CustomerService {
			
	List<Customer> customers= new ArrayList<>(Arrays.asList(
				new Customer("sridhar","C","Trivandrum"),
				new Customer("prabir","P","Mumbai"),
				new Customer("amit","Singh","Delhi")	
			));

	public List<Customer> getCustomers(){
		return customers;
	}

	public Customer getCustomer(String firstName) {
		return (Customer) customers.stream().filter(c->c.getFirstName().equalsIgnoreCase(firstName)).findFirst().get();
		
	}

	public void addCustomer(Customer c) {
		customers.add(c);		
	}

	public void updateCustomer(String firstName, Customer c) {
	for (int i = 0; i < customers.size(); i++) {
		Customer customer= customers.get(i);
		if(customer.getFirstName().equals(firstName)){
			customers.set(i, c);
			return;
		}
		
	}
		
	}

	public void deleteCustomer(String firstName) {
		customers.removeIf(c->c.getFirstName().equals(firstName));
		
	}
	
	
}
