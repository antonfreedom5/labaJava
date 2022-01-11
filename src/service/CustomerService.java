package service;

import entity.Customer;

import java.util.Date;
import java.util.List;

public interface CustomerService {

    public void add(Long id, String name, Date birthday, String address, String phone, String passport, String notes);

    public List<Customer> getAll();
}
