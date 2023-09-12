package com.unit.testing.dao;

import com.unit.testing.dto.Grocery;
import com.unit.testing.dto.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GroceryDaoService {

    public List<Item> callService(){
        RestTemplate restTemplateConnect = new RestTemplate();
        ResponseEntity<Item[]> response = restTemplateConnect.getForEntity("https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json", Item[].class);
        List<Item> itemList = Arrays.asList(response.getBody());
        return  itemList;
    }
}
