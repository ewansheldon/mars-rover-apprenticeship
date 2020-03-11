package com.codurance.mars_rover;

public class South implements Direction {
  public Direction turnRight() {
    return new West();
  }

  public String symbol() {
    return "S";
  }

  public Vector getMovementVector() {
    return new Vector(0, -1);
  }

  public Direction turnLeft() {
    return new East();
  }
}
