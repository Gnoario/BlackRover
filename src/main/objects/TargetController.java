/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.objects;

import java.util.LinkedList;
import jplay.Scene;
import jplay.Sound;
import jplay.URL;
import main.world.Special;
import entity.Character;

/**
 *
 * @author tadeu
 */
public class TargetController {

    LinkedList<Special> specials = new LinkedList<>();

    public void addSpell(double x, double y, int direction, Scene scene) {
        Special special = new Special(x, y, direction);
        specials.addFirst(special);
        scene.addOverlay(special);
        targetSound();
    }

    public void run(Character character) {
        for (int i = 0; i < specials.size(); i++) {
            Special spell = specials.removeFirst();
            spell.move();
            specials.addLast(spell);
            if (spell.collided(character)) {
                spell.x = 10_000;
                double aux = character.getEnergy();
                aux -= 2;
                character.setEnergy(aux);
            }
        }

    }

    private void targetSound() {
        new Sound(URL.audio("flecha.wav")).play();
    }
}
