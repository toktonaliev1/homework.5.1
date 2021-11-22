package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(70);
        boss.setBossDefence("Защита от 3-удара");
        System.out.println("Здоровье босса:" + boss.getBossHealth() + " Урон босса:"
                + boss.getBossDamage() + " Тип защиты:"+ boss.getBossDefence());

    }
}
