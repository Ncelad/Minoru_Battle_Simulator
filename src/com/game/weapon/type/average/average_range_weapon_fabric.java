package com.game.weapon.type.average;
import com.game.weapon.*;

public class average_range_weapon_fabric implements weapon_fabricable {
    @Override
    public weapon create_weapon(boolean two_hand) {return new average_range_weapon(two_hand);}
}
