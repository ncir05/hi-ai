package com.inventory.hiai.resources;

import com.inventory.hiai.entities.Items;
import com.inventory.hiai.services.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getDefaultItems() {
        List<Items> items = itemService.getAllItems();
        if (items.isEmpty()) {
            return new ResponseEntity<>("No items were found", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(items, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getItemById(@PathVariable Long id) {
        Items item = itemService.getItemById(id);
        if (item == null) {
            return new ResponseEntity<>("No item was found with that ID", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(item, HttpStatus.OK);
    }


    @PostMapping("/add")
    public Items addItem(@RequestBody Items item) {
        // Some change
        return itemService.addItem(item);
    }
}