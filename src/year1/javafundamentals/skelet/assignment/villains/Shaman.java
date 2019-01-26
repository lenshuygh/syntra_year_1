package year1.javafundamentals.skelet.assignment.villains;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.heroes.Barbarian;
import year1.javafundamentals.skelet.assignment.heroes.Ranger;

/**
 * A Shaman has a (intelligence/10)% chance to block 20% of incoming damage
 *
 * The Shaman recieves 10% more damage from an Ranger
 * The Shaman recieves 10% less damage from an Barbarian
 *
 */
public class Shaman extends Orc {
    public Shaman(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = super.calculateReceiveDamage(damage,enemy);
        if(enemy instanceof Ranger){
            damageToReceive *= 1.1;
        }else if(enemy instanceof Barbarian){
            damageToReceive *= 0.9;
        }
        int diceRoll = getRandom().nextInt(100);
        if(diceRoll <= getIntelligence() / 10) {
            damageToReceive *= 0.8;
            System.out.printf("!!!!!!!!%s Has triggered a block of 20%% of incoming damage!%n",this.getName());
        }
        return damageToReceive;
    }
}
