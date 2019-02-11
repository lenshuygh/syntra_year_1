package year1.javafundamentals.skelet.assignment.villains;


/**
 * The Vampire heals itself for 10% of calculated damage dealt
 *
 */
public class Vampire extends Undead {
    public Vampire(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public int calculateDamage() {
        int damage = super.calculateDamage();
        updateHealthPool(damage / 10);
        return damage;
    }
}
