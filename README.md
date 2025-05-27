Multi-Player Text Adventure Game

Module Code: CS1OPNU
Assignment Report Title: Project
Student Number: 32804098/202383710034
Actual hrs spent for the assignment: 30h
Which Artificial Intelligence tools used (if applicable): None
Implementation Highlights
Introduction
This project is a multi-player text adventure game implemented in Java using Maven for project management. The game allows multiple players to explore interconnected rooms, interact with items, and compete or collaborate with each other. Key features include room navigation, item management, and player interactions.

Requirements
1. Game World: Create a structured game world with multiple interconnected rooms.
2. Player System: Support multiple players interacting simultaneously.
3. Game Logic: Implement rules for player interaction, item management, and progression.
4. Networking: Allow players to connect to a shared game session over a network (optional).
5. Command-Line Interface: Implement a command-line interface for player interaction.
6. Unit Testing: Include unit tests for game logic and core features.
7. Documentation: Provide documentation, including a brief README describing the game and how to run it.

Design

System Architecture Diagram
mermaid
graph TD
    A[GameWorld] --> B[Room1]
    A --> C[Room2]
    B --> D[Player1]
    C --> E[Player2]
    A --> F[RoomFactory]
    F --> B
    F --> C
