package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To3Then7() {
        int left = 7;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1to2to3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8to4to4Then8() {
        int first = 8;
        int second = 4;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to0to1to2Then10() {
        int first = 10;
        int second = 0;
        int third = 1;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0to1to0to0Then1() {
        int first = 0;
        int second = 1;
        int third = 0;
        int fourth = 0;
        int result = Max.max(first, second, third, fourth);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}