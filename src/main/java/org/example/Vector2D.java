package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public record Vector2D (double x, double y) {
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public double angle() {
        return Math.atan2(y, x);
    }

    public static Vector2D fromPolar(double magnitude, double angle) {
        log.info("Creating vector from polar coordinates: magnitude = {}, angle = {}", magnitude, angle);
        return new Vector2D(magnitude * Math.cos(angle), magnitude * Math.sin(angle));
    }
}
