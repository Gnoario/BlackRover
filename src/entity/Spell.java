package entity;

import jplay.Sprite;

public class Spell extends Sprite{
    public static final int LEFT = 1, RIGHT = 2, STOP = 3, UP = 4, DOWN = 5;
    
    protected static final int VELOCITY_TARGET = 2;
    protected int way = STOP;
    protected boolean move = false;
    protected int direction = 3;
    private int level;
    private String name;
    private String tag;
    private String description;
    private int damage;
    private int healing;
    private int energy;
    private int mana;
    private int number;
    private int max_number;

    public Spell(double x, double y, int way) {
        super("src/recursos/audio/flecha.png", 12);
        this.x = x;
        this.y = y;
        this.way = way;

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMax_number() {
        return max_number;
    }

    public void setMax_number(int max_number) {
        this.max_number = max_number;
    }

    
}