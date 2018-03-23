package com.thoughtworks.Game;

public class GameScreen {
  private final int height;
  private final int width;
  private final char[][] screenMatrix;

  public GameScreen(int height, int width) {
    this.height = height;
    this.width = width;
    this.screenMatrix = new char[this.height][this.width];
  }

  public int getScreenHeight() {
    return this.height;
  }

  public int getScreenWidth() {
    return this.width;
  }

  public void initScreen() {
    for ( int i = 0; i < this.height; i++){
      for (int j= 0; j < this.width; j++){
        this.screenMatrix[i][j] = ' ';
      }
      System.out.println('\n');
    }
  }

  public char[][] getScreenMatrix() {
    return this.screenMatrix;
  }

  public void clearALocation(int x , int y) {
    this.screenMatrix[y][x] = ' ';
  }

  public char getObjectOnLocation(int x, int y) {
    return this.screenMatrix[y][x];
  }

  public void setObjectOnLocation(GameObject obj,int x,int y) {
    this.screenMatrix[y][x] = obj.getSymbol();
  }

  public void printScreen(){
    for (int i = 0; i < this.height; i++) {
      for (int j = 0; j < this.width; j++) {
        System.out.println(this.screenMatrix[i][j]);
      }
      System.out.println('\n');
    }
  }
}
