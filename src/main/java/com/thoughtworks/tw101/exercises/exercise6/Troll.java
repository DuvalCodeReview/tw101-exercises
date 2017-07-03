package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Duvall_Lanell on 7/2/17.
 */
public class Troll extends Orc {
    String name;
    int hitPoints;

    public Troll() {
        name = "Troll";
        hitPoints = 40;
    }

    public void takeDamage (int amount) {
        if (hitPoints > 0) {
            hitPoints -= (amount / 2);
        }
    }

    public void reportStatus () {
        System.out.println("Name: " + name + "\nHitpoints: " + hitPoints + "\n");
    }
}
