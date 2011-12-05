/**
 * 
 */
package com.jsidlosky.javagfx.engine.component;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Polygon;

/**
 * @author jsidlosky
 *
 */
public class CollisionComponent extends Component {
	
	Polygon boundsPolygon;
	
	CollisionComponent(String id, Polygon boundsPolygon) {
		this.id = id;
		this.boundsPolygon = boundsPolygon;
	}

	public CollisionComponent(String string, int width, int height) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(GameContainer gc, int delta) {
	}

}
