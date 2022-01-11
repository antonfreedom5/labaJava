package service;

import entity.Product;
import entity.Storage;

import java.util.List;

public interface ProductService {

    public void add(Long id, String name, String type, Storage availability, Long costPerDay, String quality);

    public List<Product> getAll();
}
