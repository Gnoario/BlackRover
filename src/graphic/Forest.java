/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import main.world.Player;
import java.awt.Point;
import java.util.Vector;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Sprite;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;
import IA.Monster;
import sound.GameSound;

public class Forest extends Scenario{

    private Keyboard keyboard;
    private Window window;
    private Player player;
    private Scene scene;


    public Forest(Window window) {
        this.window = window;
        keyboard = window.getKeyboard();
        scene = new Scene();
        scene.loadFromFile("src/main/editorscn/Floresta.scn");
        //scene.setDrawStartPos(15, 30);
        player = new Player();
        player.x = 50;
        player.y = 230;
        GameSound.play("F.wav");
        GameImage arvores[] = new GameImage[1000];
        run();
        // for (int )

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
     
     private void changeScenario(){
        if(tileCollision(11, player, scene)== true){
            new Home(window);
            //f.run();
        }
        else if(tileCollision(02, player, scene)){
            new Dungeon(window);
        }
    }
}
