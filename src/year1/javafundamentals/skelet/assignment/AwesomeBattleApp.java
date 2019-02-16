package year1.javafundamentals.skelet.assignment;

import year1.javafundamentals.skelet.assignment.Character;
import year1.javafundamentals.skelet.assignment.teams.HeroTeam;
import year1.javafundamentals.skelet.assignment.teams.VillainTeam;

public class AwesomeBattleApp {
/*    private static final String BATTLE_INTRODUCTION = "Hero: (%s) %s VS Villain: (%s) %s%n";
    private static final String DAMAGE_DEALT = "(%s) %s [%d hp] has dealt %d damage to %s [%d hp]%n";
    private static final String DEFEATED = "%s defeated! (%s) %s has been defeated by %s%n";

    public static void main(String[] args) {
        int teamSize = 5;
        Character[] heroes = new HeroTeam(teamSize).getCharacters();
        Character[] villains = new VillainTeam(teamSize).getCharacters();

        int heroIndex = 0;
        int villainIndex = 0;
        boolean villainTurn = false;
        while(heroIndex < heroes.length && villainIndex < villains.length){
            Character currentHero = heroes[heroIndex];
            Character currentVillain = villains[villainIndex];
            System.out.printf(BATTLE_INTRODUCTION, currentHero.getClass().getSimpleName(), currentHero.getName(), currentVillain.getClass().getSimpleName(), currentVillain.getName());

            while(true){
                if(villainTurn) {
                    villainTurn = false;
                    int villainDamageDealt = currentVillain.dealDamage(currentHero);
                    System.out.printf(DAMAGE_DEALT, currentVillain.getClass().getSimpleName(), currentVillain.getName(), currentVillain.getCurrentHealthPool(), villainDamageDealt, currentHero.getName(), currentHero.getCurrentHealthPool());
                    if (currentHero.isDead()) {
                        System.out.printf(DEFEATED, "Hero", currentHero.getClass().getSimpleName(), currentHero.getName(), currentVillain.getName());
                        heroIndex++;
                        break;
                    }
                } else {
                    villainTurn = true;
                    int heroDamageDealt = currentHero.dealDamage(currentVillain);
                    System.out.printf(DAMAGE_DEALT, currentHero.getClass().getSimpleName(), currentHero.getName(), currentHero.getCurrentHealthPool(), heroDamageDealt, currentVillain.getName(), currentVillain.getCurrentHealthPool());
                    if (currentVillain.isDead()) {
                        System.out.printf(DEFEATED, "Villain", currentVillain.getClass().getSimpleName(), currentVillain.getName(), currentHero.getName());
                        villainIndex++;
                        break;
                    }
                }
            }
            System.out.println("===========================================================================================================");
            System.out.println();
        }

        if(heroIndex < villainIndex){
            System.out.println("Heroes Win!");
        } else if (villainIndex < heroIndex){
            System.out.println("Villains Win!");
        } else {
            System.out.println("It's a tie!");
        }
    }*/

}
