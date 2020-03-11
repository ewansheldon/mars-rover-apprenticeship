package com.codurance.mars_rover;

public class West implements Direction {
  public Direction turnRight() {
    return new North();
  }

  public String symbol() {
    return "W";
  }

  public Vector getMovementVector() {
    return new Vector(-1, 0);
  }

  public Direction turnLeft() {
    return new South();
  }
}
