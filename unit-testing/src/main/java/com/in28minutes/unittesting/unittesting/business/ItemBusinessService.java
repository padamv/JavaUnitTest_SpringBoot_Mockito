package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.model.Item;

public class ItemBusinessService {

    public Item retreiveHardcodedItem(){
        return new Item (1, "Ball", 10, 100);
    }
}
