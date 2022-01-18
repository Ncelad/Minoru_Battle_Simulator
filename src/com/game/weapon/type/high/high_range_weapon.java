package com.game.weapon.type.high;
import com.game.weapon.weapon;

public class high_range_weapon extends weapon {

    public high_range_weapon(boolean two_hands){
         damage = 15;
         range = 8;
         attack_speed = 0.5;
         critical_damage_scale = 2;
         critical_damage_chance = 30;
         miss_chance = 60;
         requires_two_hand = true;
    }

    @Override
    public String toString() {
        return String.valueOf(attack_speed);
    }
}
