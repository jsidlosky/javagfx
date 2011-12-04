/**
 * 
 */
package com.jsidlosky.javagfx.engine.component.render;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.jsidlosky.javagfx.engine.component.Component;



/**
 * @author jsidlosky
 *
 */
public abstract class RenderComponent extends Component {
	 
    /**
     * Instantiates a new render component.
     *
     * @param id the id
     */
    public RenderComponent(String id)
    {
	this.id = id;
    }
 
    public abstract void render(GameContainer gc, Graphics gr);
}
