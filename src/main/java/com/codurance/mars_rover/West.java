package com.codurance.mars_rover;

public class West extends Direction {
  public West(int x, int y) {
    super(x, y);
  }

  public Direction turnRight() {
    return new North(x, y);
  }

  public String symbol() {
    return "W";
  }

  public Vector getMovementVector() {
    return new Vector(-1, 0);
  }

  public Direction turnLeft() {
    return new South(x, y);
  }
}
