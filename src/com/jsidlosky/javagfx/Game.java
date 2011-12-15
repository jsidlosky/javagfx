/**
 *
 */
package com.jsidlosky.javagfx;

import com.jsidlosky.javagfx.engine.Entity;
import com.jsidlosky.javagfx.engine.component.CollisionComponent;
import com.jsidlosky.javagfx.engine.component.movement.PlayerMovementComponent;
import com.jsidlosky.javagfx.engine.component.render.ImageRenderComponent;
import com.jsidlosky.javagfx.map.MapData;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Vector2f;

import java.util.ArrayList;

/**
 * @author jsidlosky
 */
class Game extends BasicGame {

	/**
	 * Entities
	 */
	private Entity playerEntity = null;

	/**
	 * Level Entities
	 */
	private final ArrayList<Entity> mapEntities = new ArrayList<Entity>();

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
		Image brickImage = new Image("res/brick.png");
		Image playerImage = new Image("res/player.png");

		playerEntity = new Entity("player");
		playerEntity.addComponent(new ImageRenderComponent("PlayerRender", playerImage));
		playerEntity.addComponent(new CollisionComponent("Collision", playerImage.getWidth(),
				playerImage.getHeight()));
		playerEntity.addComponent(new PlayerMovementComponent("PlayerMovement"));

		/* Player */
		int playerY = 2;
		int playerX = 3;
		playerEntity.setPosition(new Vector2f(playerX * 16, playerY * 16 + 300));

		// Load the map entities
		int mapData[][] = MapData.getMapData();
		for (int row = 0; row < mapData.length; row++) {

			for (int col = 0; col < mapData[row].length; col++) {

				if (mapData[row][col] > 0) {
					Entity mapEntity = new Entity("brick");
					mapEntity.addComponent(new ImageRenderComponent("BrickRender", brickImage));
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
		for (Entity e : mapEntities) {
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
		for (Entity e : mapEntities) {
			e.render(gc, gr);
		}

		// Render the player
		playerEntity.render(gc, gr);
	}
}
