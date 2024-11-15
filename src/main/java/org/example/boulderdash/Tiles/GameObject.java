package org.example.boulderdash.Tiles;

import javafx.scene.canvas.GraphicsContext;

/**
 * Represents an abstract game object in the Boulder Dash game.
 * Each game object has an x and y position on a grid with a fixed tile size.
 *
 * @author prasxxxt
 * @version 1.0
 */
public abstract class GameObject {
    protected int x, y;
    public static final int TILE_SIZE = 40;

    /**
     * Constructs a GameObject at the specified grid coordinates.
     *
     * @param x the x-coordinate of the object
     * @param y the y-coordinate of the object
     */
    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Renders the game object using the specified GraphicsContext.
     *
     * @param gc the GraphicsContext to use for rendering
     */
    public abstract void render(GraphicsContext gc);

    /**
     * Gets the x-coordinate of the game object.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y-coordinate of the game object.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the x-coordinate of the game object.
     *
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate of the game object.
     *
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }
}
