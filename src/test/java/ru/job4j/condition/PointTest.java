package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double expected = 2;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to20then2dot83() {
        Point first = new Point(0, 2);
        Point second = new Point(2, 0);
        double expected = 2.83;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when110to15then5() {
        Point first = new Point(1, 10);
        Point second = new Point(1, 5);
        double expected = 5;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to18then7() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 8);
        double expected = 7;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to202then2dot83() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(2, 0, 2);
        double expected = 2.83;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when121to333then3() {
        Point first = new Point(1, 2, 1);
        Point second = new Point(3, 3, 3);
        double expected = 3;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}