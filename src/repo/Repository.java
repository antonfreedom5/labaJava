package repo;

import entity.Customer;
import entity.Discount;
import entity.Product;
import entity.Storage;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository repository;

    private List<Customer> customers = new ArrayList<>();
    private List<Discount> discounts = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Storage> storages = new ArrayList<>();

    private Repository() {
    }

    public static Repository getInstance() {
        if (repository == null) {
            repository = new Repository();
            return repository;
        }
        return repository;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers.add(customers);
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Discount discount) {
        this.discounts.add(discount);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        this.products.add(product);
    }

    public List<Storage> getStorages() {
        return storages;
    }

    public void setStorages(Storage storage) {
        this.storages.add(storage);
    }
}
