package org.example;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MathUtils {
    public static double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }
}
