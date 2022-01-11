package service.impl;

import entity.Customer;
import repo.Repository;
import service.CustomerService;

import java.util.Date;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private Repository repository;

    public CustomerServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Long id, String name, Date birthday, String address, String phone, String passport, String notes) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setAddress(address);
        customer.setBirthday(birthday);
        customer.setNotes(notes);
        customer.setPassport(passport);
        customer.setPhone(phone);

        this.repository.setCustomers(customer);
    }

    @Override
    public List<Customer> getAll() {
        return this.repository.getCustomers();
    }
}
