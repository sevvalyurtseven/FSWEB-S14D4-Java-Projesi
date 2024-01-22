package com.workintech.store.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public static final double BLEED_PERCENTAGE_CONSTANT = 0.25;
    public static final double POISON_PERCENTAGE_CONSTANT = 0.30;

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double bleed() {
        return getDamage() * BLEED_PERCENTAGE_CONSTANT;
    }

    @Override
    public double poison() {
        return getDamage() * POISON_PERCENTAGE_CONSTANT;
    }
}
