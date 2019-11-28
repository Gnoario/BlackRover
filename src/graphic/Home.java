/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import main.world.Player;
import java.awt.Point;
import java.util.Vector;
import jplay.Keyboard;
import jplay.Scene;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;
import IA.Monster;
import IA.NPC;
import java.awt.Color;
import sound.GameSound;

/**
 *
 * @author tadeu
 */
public class Home extends Scenario {

    private Keyboard keyboard;
    private Window window;
    private Player player;
    private Scene scene;
    private NPC npc;

    public Home(Window window) {
        this.window = window;
        keyboard = window.getKeyboard();
        scene = new Scene();
        scene.loadFromFile("src/main/editorscn/Home.scn");
        //scene.setDrawStartPos(15, 30);
        player = new Player();
        player.x = 454;
        player.y = 154;
        npc = new NPC();
        npc.x = 450;
        npc.y = 200;
        GameSound.play("R.wav");
        //scene.addOverlay(player);
        //scene.addOverlay(teste);
        //scene.addOverlay(monster);
        run();
    }

    public void run() {


        boolean loop = true;
        while (loop) {
            player.move(keyboard, window);
            player.way(scene);
            scene.moveScene(player);
            player.x += scene.getXOffset();
            player.y += scene.getXOffset();

            player.draw();
            npc.draw();

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
        if (tileCollision(11, player, scene) == true) {
            new Forest(window);
            //f.run();
        } else if (tileCollision(05, player, scene) == true) {
            new Sanctuary(window);
        }
    }
}
