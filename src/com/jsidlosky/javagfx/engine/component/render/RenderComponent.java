/**
 *
 */
package com.jsidlosky.javagfx.engine.component.render;

import com.jsidlosky.javagfx.engine.component.Component;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;


/**
 * @author jsidlosky
 */
public abstract class RenderComponent extends Component {

    /**
     * Instantiates a new render component.
     *
     * @param id the id
     */
    RenderComponent(String id) {
        this.id = id;
    }

    public abstract void render(GameContainer gc, Graphics gr);
}
