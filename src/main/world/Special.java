/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.world;

import entity.Spell;

/**
 *
 * @author tadeu
 */
public class Special extends Spell {

    public Special(double x, double y, int way) {
        super(x, y, way);
    }

    public void move() {
        if (way == LEFT) {
            this.x -= VELOCITY_TARGET;
            if (direction != 1) {
                setSequence(3, 6);
            }
            move = true;
        }
        if (way == RIGHT) {
            this.x += VELOCITY_TARGET;
            if (direction != 2) {
                setSequence(6, 9);
            }
            move = true;
        }
        if (way == UP) {
            this.y -= VELOCITY_TARGET;
            if (direction != 4) {
                setSequence(9, 12);
            }
            move = true;
        }
        if (way == DOWN || way == STOP) {
            this.y += VELOCITY_TARGET;
            if (direction != 5) {
                setSequence(0, 3);
            }
            move = true;
        }
        if(move){
            update();
            move = false;
        }
    }

}
