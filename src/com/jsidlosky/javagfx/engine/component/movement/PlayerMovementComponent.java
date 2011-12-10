/**
 *
 */
package com.jsidlosky.javagfx.engine.component.movement;

import com.jsidlosky.javagfx.engine.component.Component;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;

import static org.newdawn.slick.Input.*;


/**
 * @author jsidlosky
 */
public class PlayerMovementComponent extends Component {

	@Override
	public void update(GameContainer gc, int delta) {

		float rotation = owner.getRotation();
		float scale = owner.getScale();
		Vector2f position = owner.getPosition();

		Input input = gc.getInput();

		if (input.isKeyDown(KEY_A)) {
			//rotation += -0.2f * delta;
			position.x -= 0.2f * delta;
		}

		if (input.isKeyDown(KEY_D)) {
			//rotation += 0.2f * delta;
			position.x += 0.2f * delta;
		}

		if (input.isKeyDown(KEY_W)) {
			float hip = 0.4f * delta;

			position.x += Math.sin(Math.toRadians(rotation)) * hip;
			position.y -= Math.cos(Math.toRadians(rotation)) * hip;
		}

		if (input.isKeyDown(KEY_S)) {
			float hip = -0.4f * delta;

			position.x += hip
					* java.lang.Math.sin(java.lang.Math.toRadians(rotation));
			position.y -= hip
					* java.lang.Math.cos(java.lang.Math.toRadians(rotation));
		}

		owner.setPosition(position);
		owner.setRotation(rotation);
		owner.setScale(scale);
	}
}
