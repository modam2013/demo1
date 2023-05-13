package com.example.demo.service;

import com.example.demo.model.Basket;
import com.example.demo.repository.Item;
import com.example.demo.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class StoreService {
    public final Basket basket;
    private final StoreRepository storeRepository;

    public StoreService(Basket basket, StoreRepository storeRepository) {
        this.basket = basket;
        this.storeRepository = storeRepository;
    }
    public void add(Set<Integer>ids){
        basket.add(ids);
    }
    public List<Item>get(){
        return basket.get().stream().map(id->storeRepository.get(id))
                .collect(Collectors.toList());
    }
}
