package javaapplication2;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Sound {    
    
    public static synchronized void playSound(final String url) {
        File f = new File(url);
        new Thread(new Runnable() {
        // The wrapper thread is unnecessary, unless it blocks on the
        // Clip finishing; see comments.
        public void run() {
          try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(f);
            clip.open(inputStream);
            clip.start(); 
          } catch (Exception e) {
            System.err.println(e.getMessage());
          }
        }
      }).start();
    }
}