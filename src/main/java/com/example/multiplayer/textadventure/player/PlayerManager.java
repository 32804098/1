package com.example.multiplayer.textadventure.player;

import java.util.HashMap;
import java.util.Map;

public class PlayerManager {
    private Map<String, Player> players;

    public PlayerManager() {
        players = new HashMap<>();
    }

    public void addPlayer(Player player) {
        // 使用 player.getName() 来获取玩家的名字
        players.put(player.getName(), player);
    }

    public Player getPlayer(String name) {
        return players.get(name);
    }
}
