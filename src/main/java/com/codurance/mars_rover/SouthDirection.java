package com.codurance.mars_rover;

public class SouthDirection extends Direction {
  public SouthDirection() {
    super(2);
  }

  @Override
  Direction turnRight() {
    return new WestDirection();
  }

  @Override
  public String symbol() {
    return "S";
  }
}
