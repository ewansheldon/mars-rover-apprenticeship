package com.codurance.mars_rover;

public interface Direction {
  Direction turnRight();

  String symbol();

  Vector getMovementVector();

  Direction turnLeft();
}