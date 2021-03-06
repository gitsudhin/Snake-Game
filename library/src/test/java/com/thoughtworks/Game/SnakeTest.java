package com.thoughtworks.Game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SnakeTest {

    private Snake snake;

    @Before
    public void setUp() throws Exception {
        snake = new Snake('@', 2, 2);
    }

    @Test
    public void snakeShouldMoveLeft() {
        assertThat(snake.getxPos(),is(2));
        assertThat(snake.getyPos(),is(2));
        snake.moveLeft(new GameScreen(10,10),snake);
        assertThat(snake.getxPos(),is(1));
        assertThat(snake.getyPos(),is(2));
    }

    @Test
    public void snakeShouldMoveRight() {
        assertThat(snake.getxPos(),is(2));
        assertThat(snake.getyPos(),is(2));
        snake.moveRight(new GameScreen(10,10),snake);
        assertThat(snake.getxPos(),is(3));
        assertThat(snake.getyPos(),is(2));
    }
    @Test
    public void snakeShouldMoveUp() {
        assertThat(snake.getxPos(),is(2));
        assertThat(snake.getyPos(),is(2));
        snake.moveUp(new GameScreen(10,10),snake);
        assertThat(snake.getxPos(),is(2));
        assertThat(snake.getyPos(),is(1));
    }
    @Test
    public void snakeShouldMoveDown() {
        assertThat(snake.getxPos(),is(2));
        assertThat(snake.getyPos(),is(2));
        snake.moveDown(new GameScreen(10,10),snake);
        assertThat(snake.getxPos(),is(2));
        assertThat(snake.getyPos(),is(3));
    }
}
