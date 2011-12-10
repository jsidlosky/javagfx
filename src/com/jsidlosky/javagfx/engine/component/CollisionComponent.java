/**
 *
 */
package com.jsidlosky.javagfx.engine.component;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Polygon;

/**
 * @author jsidlosky
 */
public class CollisionComponent extends Component {

    private Polygon boundsPolygon;

    CollisionComponent(String id, Polygon boundsPolygon) {
        this.id = id;
        this.boundsPolygon = boundsPolygon;
    }

    public CollisionComponent(String id, int width, int height) {
        this.id = id;
        this.boundsPolygon = new Polygon(new float[]{0, 0, width, 0, width, height, 0, height});
    }

    public CollisionComponent(String id) {

    }

    @Override
    public void update(GameContainer gc, int delta) {
    }

}
