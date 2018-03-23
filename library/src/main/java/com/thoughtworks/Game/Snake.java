package com.thoughtworks.Game;

public class Snake extends GameObject {
    public Snake(char symbol,int xPos,int yPos) {
        setSymbol(symbol);
        setxPos(xPos);
        setyPos(yPos);
    }

    public void moveLeft(GameScreen screen,Snake snake) {
        snake.setxPos(getxPos()-1);
        screen.setObjectOnLocation(snake, snake.getxPos(), snake.getyPos());
        screen.clearALocation(snake.getxPos() + 1, snake.getyPos());
    }

    public void moveRight(GameScreen screen, Snake snake) {
        snake.setxPos(getxPos()+1);
        screen.setObjectOnLocation(snake, snake.getxPos(), snake.getyPos());
        screen.clearALocation(snake.getxPos() + 1, snake.getyPos());
    }
}
