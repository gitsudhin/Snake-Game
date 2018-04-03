package com.thoughtworks.Game;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

public class FoodTest {
  @Test
  public void shouldAddRandomFood() {
    Food food = new Food('*');
    GameScreen screen = new GameScreen(2, 2);
    food.addRandomFood(0,1,screen,food);
    assertThat(screen.getObjectOnLocation(0,1),is('*'));
  }

  @Test
  public void shouldGiveARandomNumberBetween1AndScreenWidth() {
    Food food = new Food('*');
    int randomNumber = food.generateRandomNumber(3);
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(1);
    expected.add(2);
    expected.add(3);
    assertThat(expected,hasItem(randomNumber));
  }
}
