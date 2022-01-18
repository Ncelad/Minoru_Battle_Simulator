package com.game.weapon.type.average;
import com.game.weapon.weapon;

public class average_range_weapon extends weapon {

    public average_range_weapon(boolean two_hand){
        damage = 20;
        range = 2;
        critical_damage_scale = 2;
        critical_damage_chance = 45;
        requires_two_hand = two_hand;
        if(!two_hand) {
            attack_speed = 1.4;
            miss_chance = 45;
        }
        else {
            attack_speed = 1;
            miss_chance = 40;
        }

    }

    @Override
    public String toString() {
        return String.format("%d,%d,%d,%d,%d,%d,%b",this.damage,this.range,this.attack_speed,this.critical_damage_chance,this.critical_damage_scale,this.miss_chance,this.requires_two_hand);
    }
}
