/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.objects;

import jplay.GameObject;
import jplay.TileInfo;

/**
 *
 * @author tadeu
 */
public class ZoneRestrictController {

    public boolean collision(GameObject obj, TileInfo tile) {
        if ((tile.id >= 12) && obj.collided(tile)) {
            return true;
        }
        return false;
    }

}
