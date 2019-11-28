/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IA;

import entity.Character;

/**
 *
 * @author tadeu
 */
public class NPC extends Character{
    
    public NPC() {
         super("src/recursos/tiles/npc/npc3.png", 16);
        this.setTotalDuration(2000);
        this.velocity = 0.3;
    }
    
    
    public void wayMap(double x, double y) {
        if (this.x > x && this.y <= y + 50 && this.y >= y - 50) {
            moveTo(x, y, velocity);
            if (direction != 1) {
                setSequence(4, 6);
                direction = 1;
            }
            move = true;
        } else if (this.x < x && this.y <= y + 50 && this.y >= - 50) {
            moveTo(x, y, velocity);
            if (direction != 2) {
                setSequence(7, 9);
                direction = 2;
            }
            move = true;
        }
        if(move){
            update();
            move = false;
        }
    }
    
}
