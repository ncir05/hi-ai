package com.inventory.hiai.resources;

import com.inventory.hiai.entities.Items;
import com.inventory.hiai.models.Item;
import com.inventory.hiai.services.ItemService;
import org.springframework.security.access.annotation.Secured;
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
    public Items[] getDefaultItems() {
        List<Items> items = itemService.getAllItems();
        return items.toArray(new Items[0]);
    }

    @PostMapping("/adds")
    public Items addItem(@RequestBody Items item) {
        // Some change
        return itemService.addItem(item);
    }
}