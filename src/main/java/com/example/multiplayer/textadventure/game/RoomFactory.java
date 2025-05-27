package com.example.multiplayer.textadventure.game;

public class RoomFactory {
    public Room createRoom(String name, String description) {
        return new Room(name, description);
    }
}
