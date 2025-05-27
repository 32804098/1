package com.example.multiplayer.textadventure.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void testRoomCreation() {
        RoomFactory factory = new RoomFactory();
        Room room = factory.createRoom("Test Room", "A test room");
        assertNotNull(room); // 验证房间对象不为 null
        assertEquals("test room", room.getName()); // 调整期望值为小写
    }
}
