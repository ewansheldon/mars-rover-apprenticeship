package com.codurance.mars_rover;

public class WestDirection implements Direction {
  public Direction turnRight() {
    return new NorthDirection();
  }

  public String symbol() {
    return "W";
  }

  public Vector getMovementVector() {
    return new Vector(-1, 0);
  }
}
