package com.thoughtworks.Game;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SnakeTest {
    @Test
    public void snakeShouldMoveLeft() {
        Snake snake = new Snake('@', 2, 2);
        assertThat(snake.getxPos(),is(2));
        assertThat(snake.getyPos(),is(2));
        snake.moveLeft(new GameScreen(10,10),snake);
        assertThat(snake.getxPos(),is(1));
        assertThat(snake.getyPos(),is(2));
    }
}
