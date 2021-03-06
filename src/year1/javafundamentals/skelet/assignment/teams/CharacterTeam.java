package year1.javafundamentals.skelet.assignment.teams;

import year1.javafundamentals.skelet.assignment.Character;

import java.util.Random;

public abstract class CharacterTeam {
    private Character[] characters;
    private Random random;


    public CharacterTeam(int size) {
        characters = new Character[size];
        generateCharacterTeam();
    }

    public Character[] getCharacters() {
        return characters;
    }

    public Random getRandom() {
        random = new Random();
        return random;
    }

    private void generateCharacterTeam(){
        for (int i = 0; i < characters.length; i++) {
            characters[i] = generateRandomCharacter();
        }
    }

    abstract protected Character generateRandomCharacter();
}
