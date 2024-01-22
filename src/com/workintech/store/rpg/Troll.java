package com.workintech.store.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return 0;
    }

    @Override
    public double poison() {
        return 0;
    }
}
