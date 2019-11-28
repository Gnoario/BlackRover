/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import IA.Monster;
import IA.NPC;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import main.world.Player;
import sound.GameSound;

/**
 *
 * @author tadeu
 */
public class Dungeon extends Scenario{
    private Keyboard keyboard;
    private Window window;
    private Player player;
    private Scene scene;
    private Monster monster[];
    private NPC npc;

    public Dungeon(Window window) {
        this.window = window;
        keyboard = window.getKeyboard();
        scene = new Scene();
        scene.loadFromFile("src/main/editorscn/Dungeon01.scn");
        //scene.setDrawStartPos(15, 30);
        player = new Player();
        player.x = 454;
        player.y = 154;
        monster = new Monster[10];
        npc = new NPC();
        npc.x = 450;
        npc.y = 200;
        GameSound.play("Bat.wav");
        //scene.addOverlay(player);
        //scene.addOverlay(teste);
        //scene.addOverlay(monster);
        run();
    }

    public void run() {

        for (int i = 0; i < monster.length; i++) {
            monster[i] = new Monster();
            monster[i].x = i * 80;
            monster[i].y = i * 80;
        }

        boolean loop = true;
        while (loop) {
            player.move(keyboard, window);
            player.way(scene);
            scene.moveScene(player);
            player.x += scene.getXOffset();
            player.y += scene.getXOffset();

            player.draw();
            npc.draw();
            for (int i = 0; i < monster.length; i++) {

                monster[i].way(scene);
                monster[i].chase(player.x, player.y);

                monster[i].x += scene.getXOffset();
                monster[i].y += scene.getXOffset();

                monster[i].draw();

                player.shoot(window, scene, keyboard, monster[i]);
                monster[i].dead();
                monster[i].killPlayer(player);
            }

            player.health(window);
            window.update();
            //draw();
            changeScenario();

            if (keyboard.keyDown(Keyboard.ESCAPE_KEY)) {
                loop = false;
            }
            window.delay(10);
        }
        window.exit();
    }

    public void draw() {
        //scene.draw();
        scene.moveScene(player);

        player.x += scene.getXOffset();
        player.y += scene.getXOffset();
        window.update();
    }

    private void changeScenario() {
        if (tileCollision(03, player, scene) == true) {
            new Forest(window);
            //f.run();
        } else if (tileCollision(04, player, scene) == true) {
            new Dungeon2(window);
        }
    }
}
