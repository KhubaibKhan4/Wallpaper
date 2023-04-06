package com.example.wallpapers;

public class Users {
    String wall,caption;

    public Users() {
    }

    public Users(String wall, String caption) {
        this.wall = wall;
        this.caption = caption;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
