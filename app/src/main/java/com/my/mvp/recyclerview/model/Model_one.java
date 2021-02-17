package com.my.mvp.recyclerview.model;

public class Model_one {

    public String name;
    public int image;

    public Model_one() {
    }

    public Model_one(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
