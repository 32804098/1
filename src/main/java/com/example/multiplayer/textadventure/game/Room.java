package com.example.multiplayer.textadventure.game;

import java.util.ArrayList;
import java.util.List;


public class Room {
    private String name;
    private String description;
    private List<String> items;

    public Room(String name, String description) {
        this.name = name.trim().toLowerCase(); // 存储时去除多余空格并转换为小写
        this.description = description;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name; // 返回小写的房间名称
    }

    public String getDescription() {
        return description;
    }

    public void addItem(String item) {
        items.add(item.trim().toLowerCase()); // 存储物品名称时去除多余空格并转换为小写
    }

    public List<String> getItems() {
        return items;
    }
}
