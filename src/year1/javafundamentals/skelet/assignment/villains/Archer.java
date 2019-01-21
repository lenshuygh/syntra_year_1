package year1.javafundamentals.skelet.assignment.villains;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.heroes.Barbarian;
import year1.javafundamentals.skelet.assignment.heroes.Wizard;

/**
 * The Archer has an (agility/30)% chance to deal x1.5 damage
 *
 * The Archer recieves 10% more damage from an Barbarian
 * The Archer recieves 10% less damage from an Wizard
 *
 */
public class Archer extends Undead {

    public Archer(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = super.calculateReceiveDamage(damage,enemy);
        if(enemy instanceof Barbarian){
            damageToReceive *= 1.1;
        }else if(enemy instanceof Wizard){
            damageToReceive *= 0.9;
        }
        return damageToReceive;
    }

    @Override
    public int calculateDamage() {
        int damage = super.calculateDamage();
        int diceRoll = getRandom().nextInt(100);
        if(diceRoll <= getAgility() / 30){
            System.out.printf("!!!!!!!%s Has triggered x1.5 damage!%n",this.getName());
            damage *= 1.5;
        }
        return damage;
    }
}
