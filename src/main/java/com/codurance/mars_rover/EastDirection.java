package com.codurance.mars_rover;

public class EastDirection implements Direction {
  public Direction turnRight() {
    return new SouthDirection();
  }

  public String symbol() {
    return "E";
  }

  public Vector getMovementVector() {
    return new Vector(1,0);
  }
}
