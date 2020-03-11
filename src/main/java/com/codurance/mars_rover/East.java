package com.codurance.mars_rover;

public class East implements Direction {
  public Direction turnRight() {
    return new South();
  }

  public String symbol() {
    return "E";
  }

  public Vector getMovementVector() {
    return new Vector(1,0);
  }

  public Direction turnLeft() {
    return new North();
  }
}
