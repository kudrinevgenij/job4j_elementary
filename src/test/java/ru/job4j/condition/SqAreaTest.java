package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        int k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP18K4Square12dot96() {
        double expected = 12.96;
        int p = 18;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP12K2Square8() {
        int expected = 8;
        int p = 12;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}