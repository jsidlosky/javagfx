/**
 * 
 */
package engine.component;

import org.newdawn.slick.GameContainer;

import engine.Entity;

/**
 * @author jsidlosky
 * 
 */
public abstract class Component {
	protected String id;
	protected Entity owner;

	public String getId() {
		return id;
	}

	public void setOwnerEntity(Entity owner) {
		this.owner = owner;
	}

	public abstract void update(GameContainer gc, int delta);
}
