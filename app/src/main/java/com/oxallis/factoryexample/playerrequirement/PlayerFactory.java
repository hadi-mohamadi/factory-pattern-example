package com.oxallis.factoryexample.playerrequirement;


import java.util.Objects;

public class PlayerFactory {

    public static Player getInstance(String path, Player.Type type) {

        Objects.requireNonNull(path);
        Objects.requireNonNull(type);

        Player player = null;
        switch (type) {
            case MP3:
                player = new Mp3Player(path);
                break;
            case OGG:
                player = new OggPlayer(path);
                break;
        }
        return player;
    }
}
