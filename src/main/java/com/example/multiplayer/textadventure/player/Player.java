package com.example.multiplayer.textadventure.player;

public class Player {
    private String name;
    private String currentRoom;

    public Player(String name) {
        this.name = name;
    }

    public void enterRoom(String roomName) {
        this.currentRoom = roomName;
        System.out.println(name + " entered " + roomName);
    }

    public String getCurrentRoom() {
        return currentRoom;
    }
    // 添加一个公共的 getter 方法来访问 name 字段
    public String getName() {
        return name;
    }
}