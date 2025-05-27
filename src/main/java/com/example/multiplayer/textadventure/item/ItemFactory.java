package com.example.multiplayer.textadventure.item;

public class ItemFactory {
    public Item createItem(String name, String description) {
        return new Item(name, description);
    }
}
