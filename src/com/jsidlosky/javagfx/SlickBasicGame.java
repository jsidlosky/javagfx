/**
 * 
 */
package com.jsidlosky.javagfx;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * @author jsidlosky
 * 
 */
public class SlickBasicGame extends BasicGame {

	public SlickBasicGame() {
		super("javagfx");
	}

	/**
	 * The main entry point.
	 * 
	 * @param args
	 *            the arguments
	 * @throws SlickException 
	 */
	public static void main(String[] args) throws SlickException {
		
		System.out.println("javagfx");
		
		AppGameContainer app = new AppGameContainer(new SlickBasicGame());
		app.setDisplayMode(800, 600, false);
		app.start();

	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

}
