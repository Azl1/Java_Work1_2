package com.company.weapon;

public class Gun extends Weapon{ //Пистолет

    @Override
    public void shot(String s) {
        super.shot("Пив-Пав!");
    }
}
