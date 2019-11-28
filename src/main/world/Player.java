package main.world;

import entity.Character;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import main.objects.TargetController;

public class Player extends Character {

    //private boolean horizontalMoveKeyPressed;
    TargetController shoot = new TargetController();
    Font f = new Font("arial", Font.BOLD, 30);

    public Player() {
        super("src/recursos/tiles/goblinslayer.png", 20);
        this.setTotalDuration(2000);
    }

    public void shoot(Window window, Scene scene, Keyboard keyboard, Character character) {
        if (keyboard.keyDown(KeyEvent.VK_A)) {
            shoot.addSpell(x + 5, y + 12, direction, scene);
        }
        shoot.run(character);
    }

    public void move(Keyboard keyboard, Window janela) {
        //horizontalMoveKeyPressed = true;
        if (keyboard.keyDown(Keyboard.LEFT_KEY) == true) {
            if (this.x > 0) {
                this.x -= velocity;
            }
            if (direction != 1) {
                setSequence(4, 8);
                direction = 1;
            }
            move = true;
        } else if (keyboard.keyDown(Keyboard.RIGHT_KEY) == true) {
            if (this.x < janela.getWidth() - 60) {
                this.x += velocity;
            }
            if (direction != 2) {
                setSequence(8, 12);
                direction = 2;
            }
            move = true;

        } else if (keyboard.keyDown(Keyboard.UP_KEY) == true) {
            if (this.y > 0) {
                this.y -= velocity;
            }
            if (direction != 4) {
                setSequence(12, 16);
                direction = 4;
            }
            move = true;
        } else if (keyboard.keyDown(Keyboard.DOWN_KEY) == true) {
            if (this.y < janela.getHeight() - 60) {
                this.y += velocity;
            }
            if (direction != 5) {
                setSequence(0, 4);
                direction = 5;
            }
            move = true;
        }
        if (move) {
            update();
            move = false;
        }

    }

    public void health(Window window) {
        window.drawText("Vida: " + (int)this.getEnergy(), 30, 30, Color.RED, f);
    }

}
