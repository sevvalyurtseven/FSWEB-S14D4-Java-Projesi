package com.workintech.store.rpg;

import com.workintech.store.rpg.util.Constants;

public class Werewolf extends Monster implements Bleedable {
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * Constants.BLEED_PERCENTAGE_CONSTANT;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() ;
    }
}
