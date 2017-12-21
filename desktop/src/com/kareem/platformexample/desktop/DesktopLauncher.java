package com.kareem.platformexample.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;
import com.kareem.platformexample.PlatformExample;

public class DesktopLauncher {
	public static void main (String[] arg) {
            
                Settings settings = new Settings();
                settings.maxHeight = 1024;
                settings.maxWidth = 1024;
                
                TexturePacker.process("raw", "packed", "player");
                
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new PlatformExample(), config);
	}
}
