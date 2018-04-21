package com.thoughtworks.Game;

public class Game {
  public static void main(String[] args) {
    final int screenWidth = 40;
    final int screenHeight = 20;
    final int startingXPos = (screenWidth-1) / 2;
    final int startingYPos = (screenHeight-1) / 2;

    GameScreen screen = new GameScreen(screenWidth, screenHeight);
    screen.initScreen();

    Wall wall = new Wall('æ');
    wall.drawHorizontalBoundary(screen,wall,0);
    wall.drawHorizontalBoundary(screen,wall,screenWidth-1);
    wall.drawVerticalBoundary(screen,wall,0);
    wall.drawVerticalBoundary(screen,wall,screenHeight-1);

    Snake snake = new Snake('@', startingXPos, startingYPos);
    screen.setObjectOnLocation(snake,startingXPos,startingYPos);

    Food food = new Food('*');
    int randomX = food.generateRandomNumber(screenWidth-1);
    int randomY = food.generateRandomNumber(screenHeight-1);
    food.addRandomFood(randomX,randomY,screen,food);
    screen.printScreen();
  }
}
