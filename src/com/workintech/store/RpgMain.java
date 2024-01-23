package com.workintech.store;


import com.workintech.store.rpg.Monster;
import com.workintech.store.rpg.Troll;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek", 1000, 40);
    }
    public void printAttackResult(Monster monster){
        System.out.println("Attack Result: " + monster.attack());
    }
}
