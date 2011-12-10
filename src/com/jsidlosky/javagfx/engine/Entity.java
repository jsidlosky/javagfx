/**
 *
 */
package com.jsidlosky.javagfx.engine;

import com.jsidlosky.javagfx.engine.component.Component;
import com.jsidlosky.javagfx.engine.component.render.RenderComponent;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;

import java.util.ArrayList;


/**
 * The Class Entity.
 *
 * @author jsidlosky
 */
public class Entity {

    /**
     * The id.
     */
    private final String id;

    /**
     * The position.
     */
    private Vector2f position;

    /**
     * The scale.
     */
    private float scale;

    /**
     * The rotation.
     */
    private float rotation;

    /**
     * The render component.
     */
    private RenderComponent renderComponent = null;

    /**
     * The components.
     */
    private ArrayList<Component> components = null;

    /**
     * Instantiates a new entity.
     *
     * @param id the id
     */
    public Entity(String id) {
        this.id = id;

        components = new ArrayList<Component>();

        position = new Vector2f(0, 0);
        scale = 1;
        rotation = 0;
    }

    /**
     * Adds the component.
     *
     * @param component the component
     */
    public void addComponent(Component component) {
        if (RenderComponent.class.isInstance(component))
            renderComponent = (RenderComponent) component;

        component.setOwnerEntity(this);
        components.add(component);
    }

    /**
     * Gets the component.
     *
     * @param id the id
     * @return the component
     */
    public Component getComponent(String id) {
        for (Component comp : components) {
            if (comp.getId().equalsIgnoreCase(id))
                return comp;
        }

        return null;
    }

    /**
     * Gets the position.
     *
     * @return the position
     */
    public Vector2f getPosition() {
        return position;
    }

    /**
     * Gets the scale.
     *
     * @return the scale
     */
    public float getScale() {
        return scale;
    }

    /**
     * Gets the rotation.
     *
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the position.
     *
     * @param position the new position
     */
    public void setPosition(Vector2f position) {
        this.position = position;
    }

    /**
     * Sets the rotation.
     *
     * @param rotate the new rotation
     */
    public void setRotation(float rotate) {
        rotation = rotate;
    }

    /**
     * Sets the scale.
     *
     * @param scale the new scale
     */
    public void setScale(float scale) {
        this.scale = scale;
    }

    /**
     * Update.
     *
     * @param gc    the gc
     * @param delta the delta
     */
    public void update(GameContainer gc, int delta) {
        for (Component component : components) {
            component.update(gc, delta);
        }
    }

    /**
     * Render.
     *
     * @param gc the GameContainer
     * @param gr the Graphics
     */
    public void render(GameContainer gc, Graphics gr) {
        if (renderComponent != null)
            renderComponent.render(gc, gr);
    }
}