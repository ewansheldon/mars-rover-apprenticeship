package com.codurance.mars_rover;

public class WestDirection implements Direction {
  public Direction turnRight() {
    return new NorthDirection();
  }

  public String symbol() {
    return "W";
  }
}
