package com.oxallis.factoryexample.playerrequirement;

public class OggPlayer implements Player {

    private String path;

    OggPlayer(String path) {
        this.path = path;
    }

    @Override
    public void play() {
        // play file in path as ogg
    }
}
