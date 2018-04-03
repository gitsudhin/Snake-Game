package com.thoughtworks.Game;

public class Food extends GameObject{
  public Food(char foodSymbol) {
    setSymbol(foodSymbol);
  }

  public void addRandomFood(int xPos, int yPos, GameScreen screen, Food food) {
    screen.setObjectOnLocation(food,xPos,yPos);
  }

  public int generateRandomNumber(int limit) {
    return (int) Math.ceil(Math.random() * limit);
  }
}
