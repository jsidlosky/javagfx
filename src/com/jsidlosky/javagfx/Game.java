/**
 * 
 */
package com.jsidlosky.javagfx;

import java.util.ArrayList;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

import com.jsidlosky.javagfx.engine.Entity;
import com.jsidlosky.javagfx.engine.component.movement.PlayerMovementComponent;
import com.jsidlosky.javagfx.engine.component.render.ImageRenderComponent;

/**
 * @author jsidlosky
 * 
 */
public class Game extends BasicGame {

	/**
	 * Resources
	 */
	protected Image brickImage = null;
	protected Image playerImage = null;

	/**
	 * Entities
	 */
	Entity playerEntity = null;

	/**
	 * Level Entities
	 */
	ArrayList<Entity> mapEntities = new ArrayList<Entity>();

	/**
	 * Level
	 */
	protected final int mapHeight = 2;
	protected final int mapWidth = 2;
	protected final int mapData[][] = { { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 } };

	/**
	 * Player
	 */
	protected final int playerX = 3;
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
	 * Initialize our game. Load our resources from the disk.
	 */
	@Override
	public void init(GameContainer gc) throws SlickException {
		// Set vertical sync to true
		gc.setVSync(true);

		// Load our resources
		brickImage = new Image("res/brick.png");
		playerImage = new Image("res/player.png");

		playerEntity = new Entity("player");
		playerEntity.AddComponent(new ImageRenderComponent("PlayerRender", playerImage));
		playerEntity.AddComponent(new PlayerMovementComponent("PlayerMovement"));
		playerEntity.setPosition(new Vector2f(playerX * 16, playerY * 16 + 300));

		// Load the map entities
		for (int row = 0; row < mapData.length; row++) {

			for (int col = 0; col < mapData[row].length; col++) {

				if (mapData[row][col] > 0) {
					Entity mapEntity = new Entity("brick");
					mapEntity.AddComponent(new ImageRenderComponent("BrickRender", brickImage));
					mapEntity.setPosition(new Vector2f(col * 16, row * 16 + 300));
					mapEntities.add(mapEntity);
				}
			}
		}
	}

	/**
	 * Update the game state.
	 */
	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		for(Entity e : mapEntities) {
			e.update(gc, delta);
		}
		
		playerEntity.update(gc, delta);
	}

	/**
	 * Render the current game state to the display.
	 */
	@Override
	public void render(GameContainer gc, Graphics gr) throws SlickException {
	
		// Render the map entities
		for(Entity e : mapEntities) {
			e.render(gc, gr);
		}

		// Render the player
		playerEntity.render(gc, gr);
	}
}
