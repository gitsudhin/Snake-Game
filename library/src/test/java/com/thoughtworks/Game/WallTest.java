package com.thoughtworks.Game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WallTest {

  private Wall wall;
  private GameScreen gameScreen;

  @Before
  public void setUp() {
    wall = new Wall('%');
    gameScreen = new GameScreen(3, 3);
    gameScreen.initScreen();
  }

  @Test
  public void MustDrawHorizontalBoundary() {
    wall.drawHorizontalBoundary(gameScreen,wall,0);
    assertThat(gameScreen.getObjectOnLocation(0,0),is('%'));
    assertThat(gameScreen.getObjectOnLocation(1,0),is('%'));
    assertThat(gameScreen.getObjectOnLocation(2,0),is('%'));
    assertThat(gameScreen.getObjectOnLocation(1,1),is(' '));
  }
  @Test
  public void MustDrawVerticalBoundary() {
    wall.drawVerticalBoundary(gameScreen,wall,0);
    assertThat(gameScreen.getObjectOnLocation(0,0),is('%'));
    assertThat(gameScreen.getObjectOnLocation(0,1),is('%'));
    assertThat(gameScreen.getObjectOnLocation(0,2),is('%'));
    assertThat(gameScreen.getObjectOnLocation(1,1),is(' '));
  }
}
