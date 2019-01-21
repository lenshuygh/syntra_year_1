package year1.javafundamentals.skelet.assignment.teams;


import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.heroes.*;
import year1.javafundamentals.skelet.assignment.villains.*;

public class VillainTeam extends CharacterTeam{
    public VillainTeam(int size) {
        super(size);
    }

    @Override
    Character generateRandomCharacter() {
        int rando = getRandom().nextInt(3);
        Villain villain;
        switch (rando) {
            case 0:
                villain = new Archer(50, 150, 100);
                break;
            case 1:
                villain = new Vampire(100, 100, 100);
                break;
            case 2:
                villain = new Berserker(150, 100, 50);
                break;
            case 3:
                villain = new Shaman(50, 100, 150);
                break;
            default:
                villain = new Shaman(50, 100, 150);
        }
        return villain;
    }
}
