package com.codurance.mars_rover;

public class NorthDirection extends Direction {

  public NorthDirection() {
    super(0);
  }

  @Override
  Direction turnRight() {
    return new EastDirection();
  }

  @Override
  public String symbol() {
    return "N";
  }
}
