package year1.javafundamentals.skelet.assignment.heroes;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.villains.Archer;
import year1.javafundamentals.skelet.assignment.villains.Shaman;

/**
 * Barbarian deals 10% more damage when hp is below 50%
 *
 * The Barbarian recieves 10% more damage from an Shaman
 * The Barbarian recieves 10% less damage from an Archer
 */
public class Barbarian extends Human{

    public Barbarian(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = super.calculateReceiveDamage(damage, enemy);
        if(enemy instanceof Shaman){
            damageToReceive *= 1.1;
        }else if(enemy instanceof Archer){
            damageToReceive *= 0.9;
        }
        return damageToReceive;
    }

    @Override
    public int calculateDamage() {
        int damage = super.calculateDamage();
        // todo: use percentage
        if(getCurrentHealthPool() < (getHealthPoolMax() / 2)){
            System.out.printf("!!!!!!!!%s Has triggered 10%% more damage!%n",this.getName());
            damage *= 1.1;
        }
        return damage;
    }
}
