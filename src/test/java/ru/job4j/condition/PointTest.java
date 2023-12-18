package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when05to12then3dot16() {
        double expected = 3.16;
        Point point1 = new Point(0, 5);
        Point point2 = new Point(1, 2);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when42to25then3dot6() {
        double expected = 3.6;
        Point point1 = new Point(4, 2);
        Point point2 = new Point(2, 5);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when44to22then2dot82() {
        double expected = 2.82;
        Point point1 = new Point(4, 4);
        Point point2 = new Point(2, 2);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}