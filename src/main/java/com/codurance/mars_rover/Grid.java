package com.codurance.mars_rover;

public class Grid {
    private final int x;
    private final int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void wrap(Coordinates coordinates) {
        if(coordinates.getY() < 0){
            coordinates.setY(this.y - 1);
        }
        if(coordinates.getY() >= y){
            coordinates.setY(0);
        }
    }
}
