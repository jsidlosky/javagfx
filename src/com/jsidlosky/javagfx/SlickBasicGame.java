/**
 * 
 */
package com.jsidlosky.javagfx;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * @author jsidlosky
 * 
 */
public class SlickBasicGame {	
	/**
	 * The main entry point.
	 * 
	 * @param args
	 *            the arguments
	 * @throws SlickException
	 */
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new Game("javagfx"));
		app.setDisplayMode(800, 600, false);
		app.start();
	}
}
