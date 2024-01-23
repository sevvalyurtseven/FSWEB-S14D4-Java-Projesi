package com.workintech.store;


import com.workintech.store.rpg.Monster;
import com.workintech.store.rpg.Troll;
import com.workintech.store.rpg.Werewolf;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek", 1000, 40);
        Monster wolf = new Werewolf("Wolf", 500, 100);
        printAttackResult(shrek);
        printAttackResult(wolf);
    }
    private static void printAttackResult(Monster monster){
        System.out.println("Attack Result of "+ monster.getName() + " : " + monster.attack());
    }
}
