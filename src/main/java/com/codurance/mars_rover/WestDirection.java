package com.codurance.mars_rover;

public class WestDirection extends Direction {
  public WestDirection() {
    super(3);
  }

  @Override
  Direction turnRight() {
    return new NorthDirection();
  }

  @Override
  public String symbol() {
    return "W";
  }
}
