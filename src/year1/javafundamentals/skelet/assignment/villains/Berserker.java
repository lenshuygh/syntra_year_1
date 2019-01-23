package year1.javafundamentals.skelet.assignment.villains;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.heroes.Ranger;
import year1.javafundamentals.skelet.assignment.heroes.Wizard;

/**
 * Berserker deals 20% more damage when hp is below 25%
 *
 * The Berserker recieves 10% more damage from an Wizard
 * The Berserker recieves 10% less damage from an Ranger
 */
public class Berserker extends Orc{
    public Berserker(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateDamage() {
        int damage = super.calculateDamage();
        // todo: check if this returns a percentage, if not need to calculate it here or in a static method up the chain
        if(getCurrentHealthPool() < 25){
            System.out.printf("!!!!!!!%s Has triggered 20%% more damage!%n",this.getName());
            damage *= 1.2;
        }
        return damage;
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = super.calculateReceiveDamage(damage,enemy);
        if(enemy instanceof Wizard){
            damageToReceive *= 1.1;
        }else if(enemy instanceof Ranger){
            damageToReceive *= 0.9;
        }
        return damageToReceive;
    }
}
