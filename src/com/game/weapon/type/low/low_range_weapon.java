package com.game.weapon.type.low;
import com.game.weapon.weapon;

public class low_range_weapon extends weapon {

    public low_range_weapon(boolean two_hand){
        damage = 25;
        range = 1;
        attack_speed = 1.5;
        critical_damage_scale = 2.2;
        critical_damage_chance = 50;
        requires_two_hand = two_hand;
        if(!two_hand) {
            miss_chance = 40;
        }
        else{
            miss_chance = 30;
        }
    }

    @Override
    public String toString() {
        return String.format("%d,%d,%d,%d,%d,%d,%b",this.damage,this.range,this.attack_speed,this.critical_damage_chance,this.critical_damage_scale,this.miss_chance,this.requires_two_hand);
    }
}
