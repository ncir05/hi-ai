package com.inventory.hiai.repos;

import com.inventory.hiai.entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Items, Long> {
    Items save(Items item);
}
