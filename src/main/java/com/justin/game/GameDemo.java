package com.justin.game;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class GameDemo {
	
	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(600,400));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		while (!Display.isCloseRequested()) {
			Display.update();
		}
		
		Display.destroy();
	}
	
	public static void main(String[] argv) {
		GameDemo displayExample = new GameDemo();
		displayExample.start();
	}
}
