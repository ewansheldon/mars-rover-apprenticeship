package com.codurance.mars_rover;

public class WestDirection extends Direction {
  public Direction turnRight() {
    return new NorthDirection();
  }

  public String symbol() {
    return "W";
  }
}
