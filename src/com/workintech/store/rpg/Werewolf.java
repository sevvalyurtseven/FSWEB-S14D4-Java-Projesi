package com.workintech.store.rpg;

public class Werewolf extends Monster implements Bleedable {
    public static final double BLEED_PERCENTAGE_CONSTANT = 0.25;
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * BLEED_PERCENTAGE_CONSTANT;
    }

    @Override
    public double attack() {
        return 0;
    }
}
