/**
 * 
 */
package com.jsidlosky.javagfx;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * @author jsidlosky
 * 
 */
public class Game extends BasicGame {
	
	/**
	 * Resources
	 */
	protected Image brick = null;
	protected Image player = null;

	/**
	 * Level
	 */
	protected final int mapHeight = 2;
	protected final int mapWidth = 2;
	protected final int mapData[][] = {{0,0,0,0,0,0,1,1,1,0},
									   {0,0,0,0,0,0,0,0,0,0},
									   {0,0,0,0,0,0,0,0,0,0},
									   {1,1,1,1,0,1,1,1,1,1}};
	
	/**
	 * Player
	 */
	protected final int playerX = 0;
	protected final int playerY = 2;

	/**
	 * Default constructor.
	 * 
	 * @throws SlickException
	 */
	public Game() throws SlickException {
		super("javagfx");
	}


	public Game(String title) {
		super(title);
	}

	/**
	 * Render the current game state to the display.
	 */
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		
		final int scale = 1;
		final int y_offset = 300; 
		
		// Render the map
		for(int row = 0; row < mapData.length; row++) {
			for(int col = 0; col < mapData[row].length; col++) {
				if(mapData[row][col] > 0)
					brick.draw(col * 16, row * 16 + y_offset, scale);
			}
		}
		
		// Render the player
		player.draw(playerX * 16, playerY * 16 + y_offset, scale);
	}

	/**
	 * Initialize our game. Load our resources from the disk.
	 */
	@Override
	public void init(GameContainer gc) throws SlickException {
		brick = new Image("res/brick.png");
		player = new Image("res/player.png");
	}

	/**
	 * Update the game state.
	 */
	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
	}
}
