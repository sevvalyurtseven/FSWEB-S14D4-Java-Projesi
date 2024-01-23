package com.workintech.store.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public static final double BLEED_PERCENTAGE_CONSTANT = 0.25;

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + (getDamage() * poison());
    }

    @Override
    public double bleed() {
        return getDamage() * BLEED_PERCENTAGE_CONSTANT;
    }


}
