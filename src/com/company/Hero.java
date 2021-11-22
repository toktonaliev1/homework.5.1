package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private int heroSuperHit;


    public Hero(int heroHealth, int heroDamage, int heroSuperHit) {
        this.heroHealth =heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperHit = heroSuperHit;

    }
    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;

    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroSuperHit() {
        return heroSuperHit;
    }
}
