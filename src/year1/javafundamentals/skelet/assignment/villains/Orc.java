package year1.javafundamentals.skelet.assignment.villains;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.heroes.Elf;
import year1.javafundamentals.skelet.assignment.heroes.Human;

/**
 * The Orc recieves 5% more damage from an Elf
 * The Orc recieves 5% less damage from a Human
 *
 */
public abstract class Orc extends Villain{
    public Orc(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = damage;
        if(enemy instanceof Elf){
            damageToReceive *= 1.05;
        }else if(enemy instanceof Human){
            damageToReceive *= 0.95;
        }
        return damageToReceive;
    }
}
