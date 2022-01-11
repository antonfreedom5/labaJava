package service;

import entity.Product;
import entity.Storage;

import java.util.List;

public interface StorageService {

    public void add(Long id, String name, String address, String type, String phone, List<Product>products);

    public List<Storage> getAll();
}
