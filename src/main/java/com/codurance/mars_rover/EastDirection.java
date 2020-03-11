package com.codurance.mars_rover;

public class EastDirection extends Direction {
  public Direction turnRight() {
    return new SouthDirection();
  }

  public String symbol() {
    return "E";
  }
}
