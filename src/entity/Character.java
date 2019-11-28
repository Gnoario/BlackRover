package entity;

import jplay.Sprite;
import main.world.Event;

public class Character extends Event {

    /**
     *
     */
    private String name;
    private int level;
    private int health; // vida atual
    private int max_health = 100; // vida maxima
    private int damage; // dano
    private int magic; // dano magico
    private int gold; // gold (dinheiro)
    private int armor; // armadura atual
    private int max_armor = 100; // armadura maxima
    private int mana;
    private int max_mana = 100;
    private double energy = 100;
    private double max_energy = 100;
    private int defence;
    private int str;
    private int intellect;
    private int dex;
    private int sort;
    private int points;
    private int xp;
    protected int direction = 3;
    protected double velocity = 1;
    protected boolean move = false;
    private int xSave;
    private int ySave;

    public Character(String fileName, int numFrames) {
        super(fileName, numFrames);
    }

    public int getxSave() {
        return xSave;
    }

    public void setxSave(int xSave) {
        this.xSave = xSave;
    }

    public int getySave() {
        return ySave;
    }

    public void setySave(int ySave) {
        this.ySave = ySave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMax_health() {
        return max_health;
    }

    public void setMax_health(int max_health) {
        this.max_health = max_health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMax_armor() {
        return max_armor;
    }

    public void setMax_armor(int max_armor) {
        this.max_armor = max_armor;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMax_mana() {
        return max_mana;
    }

    public void setMax_mana(int max_mana) {
        this.max_mana = max_mana;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getMax_energy() {
        return max_energy;
    }

    public void setMax_energy(int max_energy) {
        this.max_energy = max_energy;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

}
