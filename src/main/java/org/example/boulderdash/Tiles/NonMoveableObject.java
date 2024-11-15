package org.example.boulderdash.Tiles;

/**
 * Represents an abstract game object that cannot move within the game.
 * This serves as a base class for all non-movable objects in the game.
 *
 * @author prasxxxt
 * @version 1.0
 */
public abstract class NonMoveableObject extends GameObject {

    /**
     * Constructs a NonMoveableObject at the specified grid coordinates.
     *
     * @param x the x-coordinate of the object
     * @param y the y-coordinate of the object
     */
    public NonMoveableObject(int x, int y) {
        super(x, y);
    }

}
