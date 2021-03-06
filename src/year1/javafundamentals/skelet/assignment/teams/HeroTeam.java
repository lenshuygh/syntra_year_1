package year1.javafundamentals.skelet.assignment.teams;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.heroes.*;

public class HeroTeam extends CharacterTeam {

    public HeroTeam(int size) {
        super(size);
    }

    @Override
    protected Character generateRandomCharacter() {
        Hero hero;
        switch (getRandom().nextInt(4)) {
            case 0:
                hero = new Wizard(50, 100, 50);
                break;
            case 1:
                hero = new Ranger(50, 150, 100);
                break;
            case 2:
                hero = new Warrior(100, 100, 100);
                break;
            default:
                hero = new Barbarian(150, 100, 50);
        }
        return hero;
    }
}
