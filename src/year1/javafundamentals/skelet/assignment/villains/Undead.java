package year1.javafundamentals.skelet.assignment.villains;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.heroes.Elf;
import year1.javafundamentals.skelet.assignment.heroes.Human;

/**
 * The Undead recieves 5% more damage from a Human
 * The Undead recieves 5% less damage from an Elf
 *
 */
public abstract class Undead extends Villain {
    public Undead(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = damage;
        if(enemy instanceof Human){
            damageToReceive *= 1.05;
        }else if(enemy instanceof Elf){
            damageToReceive *= 0.95;
        }
        return damageToReceive;
    }
}
