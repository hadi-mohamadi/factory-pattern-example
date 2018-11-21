package com.oxallis.factoryexample.playerrequirement;

public class Mp3Player implements Player {

    private String path;

    Mp3Player(String path) {
        this.path = path;
    }

    @Override
    public void play() {
        // play file in path as mp3
    }
}
