package com.inventory.hiai.services;

import com.inventory.hiai.entities.Items;
import com.inventory.hiai.repos.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Items> getAllItems() {
        return itemRepository.findAll();
    }

    public Items addItem(Items item) {
        System.out.println(item);
        return itemRepository.save(item);
    }

    public Items getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }
}

