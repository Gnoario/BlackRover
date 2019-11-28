/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Point;
import java.util.Vector;
import jplay.GameObject;
import jplay.Scene;
import jplay.TileInfo;
import main.world.Player;

/**
 *
 * @author tadeu
 */
public abstract class Scenario {

    protected boolean tileCollision(int value, Player player, Scene scene) {
        Point min = new Point((int) player.x, (int) player.y);
        Point max = new Point((int) (player.x + player.width), (int) (player.y + player.height));
        Vector<?> tiles = scene.getTilesFromPosition(min, max);
        for (int i = 0; i < tiles.size(); i++) {
            TileInfo tile = (TileInfo) tiles.elementAt(i);
            if (tileCollision(player, tile, value) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean tileCollision(GameObject object, TileInfo tile, int value) {
        if ((tile.id == value) && object.collided(tile)) {
            return true;
        }
        return false;
    }
    
//    private void changeScenario(int value, Player player, Scene scene){
//        if(tileCollision(11, player, scene)== true){
//            new Forest(window);
//            //f.run();
//        }
//    }
}
