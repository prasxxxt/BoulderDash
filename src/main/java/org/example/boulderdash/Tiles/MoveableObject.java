package org.example.boulderdash.Tiles;

/**
 * Represents an abstract game object that can move within the game.
 * Provides methods to move the object in four directions.
 *
 * @author prasxxxt
 * @version 1.0
 */
public abstract class MoveableObject extends GameObject {

    /**
     * Constructs a MoveableObject at the specified grid coordinates.
     *
     * @param x the x-coordinate of the object
     * @param y the y-coordinate of the object
     */
    public MoveableObject(int x, int y) {
        super(x, y);
    }

    /**
     * Defines the path-finding behavior for the movable object.
     * This method should be implemented to determine how the object finds its path.
     */
    public abstract void findPath();

    /**
     * Moves the object up by decreasing the y-coordinate.
     */
    public void moveUp() {
        y--;
    }

    /**
     * Moves the object down by increasing the y-coordinate.
     */
    public void moveDown() {
        y++;
    }

    /**
     * Moves the object left by decreasing the x-coordinate.
     */
    public void moveLeft() {
        x--;
    }

    /**
     * Moves the object right by increasing the x-coordinate.
     */
    public void moveRight() {
        x++;
    }
}
