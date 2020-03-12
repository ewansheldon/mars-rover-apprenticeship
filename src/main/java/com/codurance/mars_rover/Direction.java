package com.codurance.mars_rover;

public interface Direction {
    Direction turnLeft();

    Direction turnRight();

    @Override
    String toString();
}
