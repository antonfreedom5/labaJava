package service;

import entity.Discount;

import java.util.List;

public interface DiscountService {

    public void add(Long id, String type, Long size);

    public List<Discount> getAll();
}
