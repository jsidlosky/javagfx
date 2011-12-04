/**
 * 
 */
package com.jsidlosky.javagfx.engine.component;

import org.newdawn.slick.GameContainer;

import com.jsidlosky.javagfx.engine.Entity;


/**
 * The Class Component.
 *
 * @author jsidlosky
 */
public abstract class Component {
	
	/** The id. */
	protected String id;
	
	/** The owner. */
	protected Entity owner;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the owner entity.
	 *
	 * @param owner the new owner entity
	 */
	public void setOwnerEntity(Entity owner) {
		this.owner = owner;
	}

	/**
	 * Update.
	 *
	 * @param gc the gc
	 * @param delta the delta
	 */
	public abstract void update(GameContainer gc, int delta);
}
