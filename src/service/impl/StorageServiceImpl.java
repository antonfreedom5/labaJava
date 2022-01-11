package service.impl;

import entity.Product;
import entity.Storage;
import repo.Repository;
import service.StorageService;

import java.util.List;

public class StorageServiceImpl implements StorageService {
    private Repository repository;

    public StorageServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Long id, String name, String address, String type, String phone, List<Product> products) {
        Storage storage = new Storage();
        storage.setName(name);
        storage.setType(type);
        storage.getAddress(address);
        storage.setPhone(phone);
        storage.setProduct(products);

        this.repository.setStorages(storage);
    }

    @Override
    public List<Storage> getAll() {
        return this.repository.getStorages();
    }
}
