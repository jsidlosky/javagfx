/**
 * 
 */
package engine;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import engine.component.Component;

/**
 * @author jsidlosky
 *
 */
public abstract class RenderComponent extends Component {
	 
    public RenderComponent(String id)
    {
	this.id = id;
    }
 
    public abstract void render(GameContainer gc, Graphics gr);
}
