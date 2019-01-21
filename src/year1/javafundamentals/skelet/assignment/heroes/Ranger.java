package year1.javafundamentals.skelet.assignment.heroes;


import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.villains.Berserker;
import year1.javafundamentals.skelet.assignment.villains.Shaman;

/**
 * The Ranger has an (agility/50)% chance to double his damage
 *
 * The Ranger recieves 10% more damage from an Berserker
 * The Ranger recieves 10% less damage from an Shaman
 */
public class Ranger extends Elf {


    public Ranger(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = super.calculateReceiveDamage(damage,enemy);
        if(enemy instanceof Shaman){
            damageToReceive *= 0.9;
        }else if(enemy instanceof Berserker){
            damageToReceive *= 1.1;
        }
        return damageToReceive;
    }

    @Override
    public int calculateDamage() {
        int damage = super.calculateDamage();
        int diceRoll = getRandom().nextInt(100);
        if(diceRoll <= getAgility() / 50){
            System.out.printf("!!!!!!!%s Has triggered x2 damage!%n",this.getName());
            damage *= 2;
        }
        return damage;
    }
}
