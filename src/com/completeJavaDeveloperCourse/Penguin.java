package com.completeJavaDeveloperCourse;

/**
 * Created by jimmypocock on 4/24/16.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly very well.");
    }
}
