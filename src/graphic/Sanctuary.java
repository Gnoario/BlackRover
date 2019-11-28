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
public class Sanctuary extends Scenario{
    
    private Keyboard keyboard;
    private Window window;
    private Player player;
    private Scene scene;
    
    
    public Sanctuary(Window window) {
        this.window = window;
        keyboard = window.getKeyboard();
        scene = new Scene();
        scene.loadFromFile("src/main/editorscn/SanctuaryO.scn");
        //scene.setDrawStartPos(15, 30);
        player = new Player();
        player.x = 300;
        player.y = 480;
        GameSound.play("I.wav");
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
            new Home(window);
            //f.run();
        }
        else if(tileCollision(11, player, scene)== true){
            new InsideSanctuary(window);
        }
    }
}
