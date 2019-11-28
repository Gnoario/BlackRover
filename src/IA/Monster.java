package IA;

import entity.Character;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;
import main.world.Player;

public class Monster extends Character {

    public Monster() {
        super("src/recursos/tiles/goblin.png", 16);
        this.setTotalDuration(2000);
        this.velocity = 0.3;
    }

    public void chase(double x, double y) {
        if (this.x > x && this.y <= y + 50 && this.y >= y - 50) {
            moveTo(x, y, velocity);
            if (direction != 1) {
                setSequence(5, 8);
                direction = 1;
            }
            move = true;
        } else if (this.x < x && this.y <= y + 50 && this.y >= - 50) {
            moveTo(x, y, velocity);
            if (direction != 2) {
                setSequence(9, 12);
                direction = 2;
            }
            move = true;
        } else if (this.y > y) {
            moveTo(x, y, velocity);
            if (direction != 4) {
                setSequence(13, 16);
                direction = 4;
            }
            move = true;
        } else if (this.y < y) {
            moveTo(x, y, velocity);
            if (direction != 5) {
                setSequence(1, 4);
                direction = 5;
            }
            move = true;
        }
        if (move) {
            update();
            move = false;
        }
    }

    public void dead() {
        if (super.getEnergy() <= 0) {
            this.velocity = 0;
            super.setDamage(0);
            this.direction = 0;
            this.move = false;
            this.x = 1_000_000;
        }
    }
    
    public void killPlayer(Player player){
        if(this.collided(player)){
            double aux = player.getEnergy();
            aux -= 0.1;
            player.setEnergy(aux);
        }
        
        if(player.getEnergy() <= 0){
            System.exit(0);
        }
    }

}
