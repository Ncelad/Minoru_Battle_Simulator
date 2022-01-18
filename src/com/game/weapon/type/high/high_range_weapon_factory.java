package com.game.weapon.type.high;
import com.game.weapon.*;

public class high_range_weapon_factory implements weapon_fabricable {
    @Override
    public weapon create_weapon(boolean two_hands){
        return new high_range_weapon(two_hands);
    }

}
