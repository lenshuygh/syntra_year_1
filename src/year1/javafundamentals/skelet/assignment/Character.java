package year1.javafundamentals.skelet.assignment;

import year1.javafundamentals.skelet.assignment.namegenerator.NameGenerator;

import java.util.Random;

public abstract class Character {
    private String name;
    private int strength;
    private int agility;
    private int intelligence;
    private int healthPoolMax;
    private int currentHealthPool;

    private Random random = new Random();

    public Character(int strength, int agility, int intelligence){
        this.setStrength(strength);
        this.setAgility(agility);
        this.setIntelligence(intelligence);
        this.name = NameGenerator.generateName();
        this.setHealthPoolMax();
        this.updateHealthPool(this.getHealthPoolMax());
    }

    public String getName() {
        return name;
    }

    private void setHealthPoolMax(){
        this.healthPoolMax = getStrength() * 3 + getAgility() * 2 + getIntelligence();
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        int newStrength = this.getStrength() + strength;
        this.strength = newStrength > 0 ? newStrength: 0;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        int newAgility = this.getAgility() + agility;
        this.agility = newAgility > 0 ? newAgility: 0;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        int newIntelligence = this.getIntelligence() + intelligence;
        this.intelligence = newIntelligence > 0 ? newIntelligence: 0;
    }

    public int getHealthPoolMax() {
        return healthPoolMax;
    }

    public int getCurrentHealthPool() {
        return currentHealthPool;
    }

    public void setCurrentHealthPool(int currentHealthPool) {
        this.currentHealthPool = currentHealthPool > 0 ? currentHealthPool: 0;
    }

    public Random getRandom() {
        return random;
    }

    public void updateHealthPool(int amount){
        int newHealthPoolValue = this.getCurrentHealthPool() + amount;
        if(newHealthPoolValue > this.getHealthPoolMax()){
            this.setCurrentHealthPool(this.getHealthPoolMax());
        } else {
            this.setCurrentHealthPool(newHealthPoolValue);
        }
    }

    public boolean isDead(){
        return this.getCurrentHealthPool() == 0;
    }

    public int dealDamage(Character character){
        int damage = this.calculateDamage();
        int receiveDamage = character.calculateReceiveDamage(damage, this);
        character.updateHealthPool(-receiveDamage);
        return receiveDamage;
    }

    public int calculateDamage(){
        int totalAttributes = (this.getStrength() + this.getAgility() + this.getIntelligence()) / 10;
        return getIntelligence()/10 + this.getRandom().nextInt(totalAttributes);
    }

    public abstract int calculateReceiveDamage(int damage, Character enemy);
}
