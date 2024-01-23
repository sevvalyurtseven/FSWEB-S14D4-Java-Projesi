package com.workintech.store.rpg;

import com.workintech.store.rpg.util.Constants;

public interface Poisonable {
    default double poison(){
        return Constants.POISON_PERCENTAGE_CONSTANT;
    };
}
