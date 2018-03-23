package com.thoughtworks.Game;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameObjectTest {
  @Test
  public void mustAssignASymbol() {
    GameObject gameObject = new GameObject();
    gameObject.setSymbol('*');
    assertThat(gameObject.getSymbol(),is('*'));
  }
}
