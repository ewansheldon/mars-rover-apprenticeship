package com.codurance.mars_rover;

public class East extends Direction {
  public East(int x, int y) {
    super(x, y);
  }

  public Direction turnRight() {
    return new South(x, y);
  }

  public String symbol() {
    return "E";
  }

  public Vector getMovementVector() {
    return new Vector(1,0);
  }

  public Direction turnLeft() {
    return new North(x, y);
  }
}
