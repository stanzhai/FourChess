package com.stanzhai.fourchess;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import android.os.Bundle;

public class MainActivity extends AndroidApplication {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = true;
        cfg.useAccelerometer = false;
        cfg.useCompass = false;
        
        initialize(new GameView(), cfg);
    }
}
