package com.company.weapon;

public class Machine extends Weapon { //Автомат

    @Override
    public void shot(String s) {
        super.shot("Та-та-та!");
    }
}
