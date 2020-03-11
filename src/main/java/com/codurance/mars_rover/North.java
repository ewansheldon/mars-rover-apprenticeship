package com.codurance.mars_rover;

public class North implements Direction {
  public Direction turnRight() {
    return new East();
  }

  public String symbol() {
    return "N";
  }

  public Vector getMovementVector() {
    return new Vector(0, 1);
  }

  public Direction turnLeft() {
    return new West();
  }
}
