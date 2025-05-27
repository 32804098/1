package com.example.multiplayer.textadventure.game;

import java.util.HashMap;
import java.util.Map;

public class GameWorld {
    private static GameWorld instance;
    private Map<String, Room> rooms;

    private GameWorld() {
        rooms = new HashMap<>();
    }

    public static synchronized GameWorld getInstance() {
        if (instance == null) {
            instance = new GameWorld();
        }
        return instance;
    }

    public void addRoom(Room room) {
        rooms.put(room.getName().trim().toLowerCase(), room); // 存储时去除多余空格并转换为小写
        System.out.println("Added room: " + room.getName().trim().toLowerCase()); // 调试信息
    }

    public Room getRoom(String name) {
        Room room = rooms.get(name.trim().toLowerCase()); // 查找时去除多余空格并转换为小写
        if (room == null) {
            System.out.println("Debug: Room not found for name: " + name.trim().toLowerCase()); // 调试信息
        }
        return room;
    }
}
