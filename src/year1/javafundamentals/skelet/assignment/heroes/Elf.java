package year1.javafundamentals.skelet.assignment.heroes;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.villains.Orc;
import year1.javafundamentals.skelet.assignment.villains.Undead;

/**
 * The Elf recieves 5% more damage from an Undead
 * The Elf recieves 5% less damage from an Orc
 *
 */
public abstract class Elf extends Hero{

    public Elf(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = damage;
        if(enemy instanceof Undead){
            damageToReceive *= 1.05;
        }else if(enemy instanceof Orc){
            damageToReceive *= 0.95;
        }
        return damageToReceive;
    }
}
