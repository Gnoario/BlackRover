/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackrover;

import graphic.Home;
import javax.swing.JOptionPane;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;
import sound.GameSound;

/**
 *
 * @author tadeu
 */
public class BlackRover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Window window = new Window(800, 600);
        boolean loop = true;
        GameImage plano = new GameImage(URL.sprite("menu2.png"));
        Keyboard teclado = window.getKeyboard();
        GameSound.play("Menu.wav");

        while (loop) {
            plano.draw();
            window.update();
            if (teclado.keyDown(Keyboard.ENTER_KEY)) {
                new Home(window);
                //window.dispose();
                //cen.run();
            }
            else if(teclado.keyDown(Keyboard.ESCAPE_KEY)){
                loop = false;
            }
            window.delay(10);
            
        }
        window.exit();
    }

}
