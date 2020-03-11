package com.codurance.mars_rover;

public class NorthDirection extends Direction {
  public Direction turnRight() {
    return new EastDirection();
  }

  public String symbol() {
    return "N";
  }
}
