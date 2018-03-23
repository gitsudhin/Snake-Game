package com.thoughtworks.Game;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameScreenTest {
  @Test
  public void mustGiveScreenHeight() {
    GameScreen gameScreen = new GameScreen(40, 80);
    assertThat(gameScreen.getScreenHeight(),is(40));
  }

  @Test
  public void mustGiveScreenWidth() {
    GameScreen gameScreen = new GameScreen(40, 80);
    assertThat(gameScreen.getScreenWidth(),is(80));
  }

  @Test
  public void mustGiveScreenMatrix() {
    char[][] sampleMatrix = new char[1][2];
    GameScreen gameScreen = new GameScreen(1, 2);

    assertThat(gameScreen.getScreenMatrix(),is(sampleMatrix));
  }

  @Test
  public void mustFillScreenMatrixWithSpaces() {
    char[][] sampleMatrix = new char[1][2];
    sampleMatrix[0][0] = ' ';
    sampleMatrix[0][1] = ' ';
    GameScreen gameScreen = new GameScreen(1, 2);
    gameScreen.initScreen();

    assertThat(gameScreen.getScreenMatrix(),is(sampleMatrix));
  }

  @Test
  public void mustClearSpecificLocation() {
    GameObject gameObject = new GameObject();
    GameScreen gameScreen = new GameScreen(1, 2);
    gameScreen.initScreen();
    gameObject.setSymbol('*');
    gameScreen.setObjectOnLocation(gameObject,1,0);
    gameScreen.clearALocation(1,0);

    assertThat(gameScreen.getObjectOnLocation(1,0),is(' '));
  }

  @Test
  public void mustGiveObjectOnLocation() {
    GameScreen gameScreen = new GameScreen(1, 2);
    gameScreen.initScreen();

    assertThat(gameScreen.getObjectOnLocation(0,0),is(' '));
  }

  @Test
  public void mustSetObjectOnLocation() {
    GameScreen gameScreen = new GameScreen(1, 2);
    GameObject gameObject = new GameObject();
    gameObject.setSymbol('*');
    gameScreen.initScreen();
    gameScreen.setObjectOnLocation(gameObject,0,0);

    assertThat(gameScreen.getObjectOnLocation(0,0),is('*'));
  }
}
