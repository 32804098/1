package com.example.multiplayer.textadventure.game;

import com.example.multiplayer.textadventure.item.Item;
import com.example.multiplayer.textadventure.item.ItemFactory;
import com.example.multiplayer.textadventure.player.Player;
import com.example.multiplayer.textadventure.player.PlayerManager;

import java.util.Scanner;

public class Game {
    private static GameWorld gameWorld = GameWorld.getInstance();
    private static PlayerManager playerManager = new PlayerManager();
    private static RoomFactory roomFactory = new RoomFactory();
    private static ItemFactory itemFactory = new ItemFactory();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 创建房间
        Room room1 = roomFactory.createRoom("Room 1", "A dark room");
        Room room2 = roomFactory.createRoom("Room 2", "A bright room");

        // 添加物品
        Item key = itemFactory.createItem("key", "A small rusty key");
        Item torch = itemFactory.createItem("torch", "A wooden torch");

        room1.addItem(key.getName());
        room2.addItem(torch.getName());

        gameWorld.addRoom(room1);
        gameWorld.addRoom(room2);

        // 创建玩家
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine().trim(); // 去除多余空格
        Player player = new Player(playerName);
        playerManager.addPlayer(player);

        // 游戏主循环
        while (true) {
            System.out.println("Enter command (move <room name>, look, take <item name>, quit):");
            String command = scanner.nextLine().trim().toLowerCase(); // 去除多余空格并转换为小写

            if (command.startsWith("move")) {
                // 提取完整的房间名称
                String roomName = command.substring(5).trim().toLowerCase(); // 去除多余空格并转换为小写
                Room room = gameWorld.getRoom(roomName);
                if (room != null) {
                    player.enterRoom(roomName);
                    System.out.println(room.getDescription());
                    if (!room.getItems().isEmpty()) {
                        System.out.println("You see: " + String.join(", ", room.getItems()));
                    }
                } else {
                    System.out.println("Room not found!");
                }
            } else if (command.equals("look")) {
                Room currentRoom = gameWorld.getRoom(player.getCurrentRoom());
                if (currentRoom != null) {
                    System.out.println(currentRoom.getDescription());
                    if (!currentRoom.getItems().isEmpty()) {
                        System.out.println("You see: " + String.join(", ", currentRoom.getItems()));
                    }
                }
            } else if (command.startsWith("take")) {
                String itemName = command.substring(5).trim().toLowerCase(); // 去除多余空格并转换为小写
                Room currentRoom = gameWorld.getRoom(player.getCurrentRoom());
                if (currentRoom != null && currentRoom.getItems().contains(itemName)) {
                    System.out.println("You took the " + itemName);
                    currentRoom.getItems().remove(itemName);
                } else {
                    System.out.println("Item not found!");
                }
            } else if (command.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }

        scanner.close();
    }
}
