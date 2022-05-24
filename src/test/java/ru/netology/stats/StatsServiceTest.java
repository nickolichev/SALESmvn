package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldSum() {

        StatsService service = new StatsService();

        int[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sum(statistic);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldMeanSum() {

        StatsService service = new StatsService();

        long[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.meanSum(statistic);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldMaxSales() {

        StatsService service = new StatsService();

        long[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSales(statistic);
        long expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldMinSales() {

        StatsService service = new StatsService();

        long[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSales(statistic);
        long expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldUnderMeanSales() {

        StatsService service = new StatsService();

        long[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.underMeanSales(statistic);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldUpMeanSales() {

        StatsService service = new StatsService();

        long[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.upMeanSales(statistic);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}

