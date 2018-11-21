package com.oxallis.factoryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.oxallis.factoryexample.playerrequirement.Player;
import com.oxallis.factoryexample.playerrequirement.PlayerFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void playMp3Example() {
        Player player = PlayerFactory.getInstance("mp3 file path", Player.Type.MP3);
        player.play();
    }

    void playOggExample() {
        Player player = PlayerFactory.getInstance("ogg file path", Player.Type.OGG);
        player.play();
    }
}
