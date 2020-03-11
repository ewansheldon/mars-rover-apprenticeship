package com.codurance.mars_rover;

public class NorthDirection implements Direction {
  public Direction turnRight() {
    return new EastDirection();
  }

  public String symbol() {
    return "N";
  }
}
