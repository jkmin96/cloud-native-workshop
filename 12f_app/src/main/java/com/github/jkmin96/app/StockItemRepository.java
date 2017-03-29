package com.github.jkmin96.app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.jkmin96.app.domain.model.ItemType;
import com.github.jkmin96.app.domain.model.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}