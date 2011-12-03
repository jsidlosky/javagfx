/**
 * 
 */
package com.jsidlosky.javagfx;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * @author jsidlosky
 * 
 */
public class SlickBasicGame extends BasicGame {

	/**
	 * Resources
	 */
	protected Image brick = null;

	/**
	 * Level Design
	 */
	protected final int mapHeight = 2;
	protected final int mapWidth = 2;
	protected final int mapData[][] = {{0,0,0,0,0,0,1,1,1,0},
									   {0,0,0,0,0,0,0,0,0,0},
									   {0,0,0,0,0,0,0,0,0,0},
									   {1,1,1,1,0,1,1,1,1,1}};

	/**
	 * Default constructor.
	 * 
	 * @throws SlickException
	 */
	public SlickBasicGame() throws SlickException {
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
	public void render(GameContainer gc, Graphics g) throws SlickException {
		
		final int y_offset = 300; 
		
		// Render the map
		for(int row = 0; row < mapData.length; row++) {
			for(int col = 0; col < mapData[row].length; col++) {
				if(mapData[row][col] > 0)
					brick.draw(col * 16, row * 16 + y_offset, 1);
			}
		}
	}

	/**
	 * Initialize our game. Load our resources from the disk.
	 */
	@Override
	public void init(GameContainer gc) throws SlickException {
		brick = new Image("res/brick.png");
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
	}

}
