package com.game.weapon.type.low;
import com.game.weapon.*;

public class low_range_weapon_fabric implements weapon_fabricable {
    @Override
    public weapon create_weapon(boolean two_hand) {return new low_range_weapon(two_hand);}
}
