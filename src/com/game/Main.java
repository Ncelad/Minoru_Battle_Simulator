package com.game;

import com.game.weapon.type.high.high_range_weapon_factory;

public class Main {

    public static void main(String[] args) {
	    System.out.println(new high_range_weapon_factory().create_weapon(true).toString());
    }
}
