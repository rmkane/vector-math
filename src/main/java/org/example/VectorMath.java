package org.example;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VectorMath {
    public static Vector2D add(Vector2D a, Vector2D b) {
        log.info("Adding vectors {} and {}", a, b);
        return new Vector2D(a.x() + b.x(), a.y() + b.y());
    }

    public static Vector2D subtract(Vector2D a, Vector2D b) {
        return new Vector2D(a.x() - b.x(), a.y() - b.y());
    }

    public static Vector2D multiply(Vector2D a, Vector2D b) {
        return new Vector2D(a.x() * b.x(), a.y() * b.y());
    }

    public static Vector2D divide(Vector2D a, Vector2D b) {
        return new Vector2D(a.x() / b.x(), a.y() / b.y());
    }

    public static Vector2D multiply(Vector2D a, double scalar) {
        return new Vector2D(a.x() * scalar, a.y() * scalar);
    }

    public static Vector2D divide(Vector2D a, double scalar) {
        return new Vector2D(a.x() / scalar, a.y() / scalar);
    }

    public static Vector2D normalize(Vector2D a) {
        return divide(a, a.magnitude());
    }

    public static double dotProduct(Vector2D a, Vector2D b) {
        return a.x() * b.x() + a.y() * b.y();
    }

    public static double crossProduct(Vector2D a, Vector2D b) {
        return a.x() * b.y() - a.y() * b.x();
    }

    public static double angle(Vector2D a, Vector2D b) {
        return Math.acos(dotProduct(a, b) / (a.magnitude() * b.magnitude()));
    }

    public static double magnitude(Vector2D a, Vector2D b) {
        return subtract(a, b).magnitude();
    }

    public static Vector2D lerp(Vector2D a, Vector2D b, double t) {
        return new Vector2D(MathUtils.lerp(a.x(), b.x(), t), MathUtils.lerp(a.y(), b.y(), t));
    }
}
