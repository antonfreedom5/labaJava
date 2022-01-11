package service.impl;

import entity.Product;
import entity.Storage;
import repo.Repository;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private Repository repository;

    public ProductServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Long id, String name, String type, Storage availability, Long costPerDay, String quality) {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setAvailability(availability);
        product.setQuality(quality);
        product.setType(type);
        product.setCostPerDay(costPerDay);

        this.repository.setProducts(product);
    }

    @Override
    public List<Product> getAll() {
        return this.repository.getProducts();
    }
}
