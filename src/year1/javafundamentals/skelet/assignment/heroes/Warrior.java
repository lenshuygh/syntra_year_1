package year1.javafundamentals.skelet.assignment.heroes;

import year1.javafundamentals.skelet.assignment.Character;

/**
 *
 * The Warrior has a (agility / 20)% chance of dodging the attack when it's HP is below 25%
 *
 */
public class Warrior extends Human{
    public Warrior(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateReceiveDamage(int damage, Character enemy) {
        int damageToReceive = super.calculateDamage();
        int diceRoll = getRandom().nextInt(100);
        if(getCurrentHealthPool() < (getHealthPoolMax() /4)){
            if(diceRoll <= getAgility() / 20){
                System.out.printf("!!!!!!!!%s Has dodged an attack!%n",this.getName());
                damageToReceive = 0;
            }
        }
        return damageToReceive;
    }
}
