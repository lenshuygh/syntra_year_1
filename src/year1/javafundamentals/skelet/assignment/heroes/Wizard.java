package year1.javafundamentals.skelet.assignment.heroes;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.villains.Archer;
import year1.javafundamentals.skelet.assignment.villains.Berserker;
import year1.javafundamentals.skelet.assignment.villains.Shaman;

/**
 * A Wizard has a (intelligence/30)% chance to block 50% of incoming damage
 *
 * The Wizard recieves 10% more damage from an Archer
 * The Wizard recieves 10% less damage from an Berserker
 *
 */
public class Wizard extends Elf {
    public Wizard(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = super.calculateReceiveDamage(damage,enemy);
        if(enemy instanceof Archer){
            damageToReceive *= 0.1;
        }else if(enemy instanceof Berserker){
            damageToReceive *=0.9;
        }
        int diceRoll = getRandom().nextInt(100);
        if(diceRoll <= getIntelligence() / 30){
            System.out.printf("!!!!!!!%s Has triggered 50%% block of incoming damage!%n",this.getName());
            damageToReceive *= 0.5;
        }
        return damageToReceive;
    }
}
