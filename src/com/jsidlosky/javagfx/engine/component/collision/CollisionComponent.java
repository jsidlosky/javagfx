/**
 *
 */
package com.jsidlosky.javagfx.engine.component.collision;

import com.jsidlosky.javagfx.engine.component.Component;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Polygon;

/**
 * @author jsidlosky
 */
public class CollisionComponent extends Component {

	private Polygon boundsPolygon;

	CollisionComponent(String id, Polygon boundsPolygon) {
		this.id = id;
		this.setBoundsPolygon(boundsPolygon);
	}

	public CollisionComponent(String id, int width, int height) {
		this.id = id;
		this.setBoundsPolygon(new Polygon(new float[]{0, 0, width, 0, width, height, 0, height}));
	}

	public CollisionComponent(String id) {

	}

	@Override
	public void update(GameContainer gc, int delta) {
	}

	public Polygon getBoundsPolygon() {
		return boundsPolygon;
	}

	public void setBoundsPolygon(Polygon boundsPolygon) {
		this.boundsPolygon = boundsPolygon;
	}
}
