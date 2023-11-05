package com.patterns.workshop.boombox;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;

    public void playFirstTrack(){
        System.out.println("Playing first song: " + tracks.get(0));
    }

    public void playNextTrack(){
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Playing next song: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack(){
        Random rnd = new Random();
        System.out.println("Playing random song: " + tracks.get(rnd.nextInt(tracks.size())));
    }

}
