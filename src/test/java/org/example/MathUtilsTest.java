package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void testAddition() {
        Vector2D position = new Vector2D(0, 0);
        Vector2D velocity = new Vector2D(3, 4);

        Vector2D newPosition = VectorMath.add(position, velocity);

        assertEquals(3, newPosition.x());
        assertEquals(4, newPosition.y());

        assertEquals(5, newPosition.magnitude());
        assertEquals(0.9272, newPosition.angle(), 0.001);

        Vector2D polar = Vector2D.fromPolar(5, 0.9272);

        assertEquals(3, polar.x(), 0.001);
        assertEquals(4, polar.y(), 0.001);
    }
}
