package com.codurance.mars_rover;

public class SouthDirection implements Direction {
  public Direction turnRight() {
    return new WestDirection();
  }

  public String symbol() {
    return "S";
  }

  public Vector getMovementVector() {
    return new Vector(0, -1);
  }
}
