package com.thoughtworks.Game;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WallTest {
  @Test
  public void MustDrawHorizontalBoundary() {
    Wall wall = new Wall('%');
    GameScreen gameScreen = new GameScreen(2, 2);
    gameScreen.initScreen();
    wall.drawHorizontalBoundary(gameScreen,wall,0);
    assertThat(gameScreen.getObjectOnLocation(0,0),is('%'));
    assertThat(gameScreen.getObjectOnLocation(1,0),is('%'));
    assertThat(gameScreen.getObjectOnLocation(1,1),is(' '));
  }
}
