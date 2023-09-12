package com.unit.testing.service;

import com.unit.testing.dao.GroceryDaoService;
import com.unit.testing.dto.Grocery;
import com.unit.testing.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroceryService {

    @Autowired
    GroceryDaoService groceryDaoService;

    public Grocery allItems(){
        List<Item> itemList = groceryDaoService.callService();
        Grocery grocery = new Grocery();
        grocery.setItemList(itemList);
        return grocery;
    }

}
