package com.codurance.mars_rover;

public class Grid {
  private final int x;
  private final int y;

  public Grid(int x, int y) {

    this.x = x;
    this.y = y;
  }

  public int getXLimit() {
    return x;
  }

  public int getYLimit() {
    return y;
  }
}
