package com.example.demo.controller;

import com.example.demo.repository.Item;
import com.example.demo.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class CtoreController {
    private final StoreService storeService;

    public CtoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public void add(@RequestParam ("id") Set<Integer>ids){
        storeService.add(ids);
    }
    @GetMapping("/get")
    public List<Item>get(){
        return storeService.get();
    }
}
