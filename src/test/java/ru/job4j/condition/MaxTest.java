package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To8To5Then8() {
        int left = 2;
        int mid = 8;
        int right = 5;
        int result = Max.max(left, mid, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To8To5To10Then10() {
        int first = 2;
        int second = 8;
        int third = 5;
        int fourth = 10;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}