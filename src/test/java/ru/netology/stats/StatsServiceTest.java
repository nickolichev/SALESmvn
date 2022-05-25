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

        int[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.meanSum(statistic);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldMaxSales() {

        StatsService service = new StatsService();

        int[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(statistic);
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldMinSales() {

        StatsService service = new StatsService();

        int[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(statistic);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldUnderMeanSales() {

        StatsService service = new StatsService();

        int[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.underMeanSales(statistic);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldUpMeanSales() {

        StatsService service = new StatsService();

        int[] statistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.upMeanSales(statistic);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}

