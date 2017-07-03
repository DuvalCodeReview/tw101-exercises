package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Duvall_Lanell on 7/2/17.
 */
public class Orc implements Monster {
    String name;
    int hitPoints;

    public Orc() {
        name = "Orc";
        hitPoints = 20;
    }

    public void takeDamage (int amount) {
        if (hitPoints > 0) {
            hitPoints -= amount;
        }
    }

    public void reportStatus () {
        System.out.println("Name: " + name + "\nHitpoints: " + hitPoints + "\n");
    }
}
