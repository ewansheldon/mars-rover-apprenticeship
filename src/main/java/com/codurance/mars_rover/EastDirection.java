package com.codurance.mars_rover;

public class EastDirection extends Direction {
  public EastDirection() {
    super(1);
  }

  @Override
  Direction turnRight() {
    return new SouthDirection();
  }

  @Override
  public String symbol() {
    return "E";
  }
}
