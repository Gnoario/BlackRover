/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sound;

import jplay.Sound;
import jplay.URL;

/**
 *
 * @author tadeu
 */
public class GameSound {

    private static Sound music;

    public static void play(String audio) {
        stop();
        music = new Sound(URL.audio(audio));
        GameSound.music.play();
        GameSound.music.setRepeat(true);
    }

    public static void stop() {
        if (GameSound.music != null) {
            music.stop();
        }
    }

}
