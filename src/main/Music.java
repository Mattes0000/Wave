package main;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class Music {
    public Clip music() {

        try {
            File file = new File("src/OST/Action_theme.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            return clip;

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}