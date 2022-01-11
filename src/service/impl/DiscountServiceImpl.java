package service.impl;

import entity.Discount;
import repo.Repository;
import service.DiscountService;

import java.util.List;

public class DiscountServiceImpl implements DiscountService {
    private Repository repository;

    public DiscountServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Long id, String type, Long size) {
        Discount discount = new Discount();
        discount.setId(id);
        discount.setType(type);
        discount.setSize(size);

        this.repository.setDiscounts(discount);
    }

    @Override
    public List<Discount> getAll() {
        return this.repository.getDiscounts();
    }
}
