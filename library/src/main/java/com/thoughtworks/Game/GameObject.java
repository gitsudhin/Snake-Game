package com.thoughtworks.Game;

public class GameObject {
  int xPos,yPos;
  char symbol;

  public char getSymbol() {
    return symbol;
  }

  public void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  public void setxPos(int xPos) {
    this.xPos = xPos;
  }

  public void setyPos(int yPos) {
    this.yPos = yPos;
  }

  public int getxPos() {
    return this.xPos;
  }

  public int getyPos() {
    return this.yPos;
  }
}
