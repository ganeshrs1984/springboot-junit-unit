package com.unit.testing.service;

import com.unit.testing.dao.GroceryDaoService;
import com.unit.testing.dto.Grocery;
import com.unit.testing.dto.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GroceryServiceTest {

    @Mock
    GroceryDaoService groceryDaoService;

    @InjectMocks
    GroceryService groceryService = new GroceryService();

    @Test
    public void test_allItems(){
        List<Item> itemList = new ArrayList<>();
        when(groceryDaoService.callService()).thenReturn(itemList);
        Grocery grocery = groceryService.allItems();
        assert grocery.getItemList().size() == 0;
    }


}