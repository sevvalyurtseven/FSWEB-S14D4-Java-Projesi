package com.workintech.store.rpg;

import com.workintech.store.rpg.util.Constants;

public class Troll extends Monster implements Bleedable, Poisonable{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + (getDamage() * poison());
    }

    @Override
    public double bleed() {
        return getDamage() * Constants.BLEED_PERCENTAGE_CONSTANT;
    }


}
