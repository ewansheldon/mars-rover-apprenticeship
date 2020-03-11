package com.codurance.mars_rover;

public class Direction {
  int index;

  public Direction(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  Direction turnRight() {
    return new Direction((index+1) % 4);
  }

  public String symbol(){
    String[] directions = new String[]{"N", "E", "S", "W"};
    return directions[index];
  }
}