package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float sumOfAreas = 0;

        for (int i = 0; i < rectangles.length; i++) {
            sumOfAreas += rectangles[i].area();
        }

        return sumOfAreas / rectangles.length;
    }
}
