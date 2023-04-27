package com.company.weapon;

public class Water_gun extends Weapon { // Водный пистолет

    @Override
    public void shot(String s) {
        super.shot("Плюк-плюк!");
    }
}
