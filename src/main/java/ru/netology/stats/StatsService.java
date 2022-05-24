package ru.netology.stats;

public class StatsService {

    public int sum(int[] statistic) {

        int sum = 0;

        for (int i = 0; i < statistic.length; i++) {

            sum += statistic[i];
        }
        return sum;
    }

    public long meanSum(long[] statistic) {

        int sum = 0;

        for (int i = 0; i < statistic.length; i++) {

            sum += statistic[i];

        }
        return sum / statistic.length;
    }

    public long maxSales(long[] statistic) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : statistic) {

            if (sale >= statistic[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public long minSales(long[] statistic) {

        int minMonth = 0;
        int month = 0;
        for (long sale : statistic) {

            if (sale <= statistic[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public long underMeanSales(long[] statistic) {

        int sum = 0;

        for (int i = 0; i < statistic.length; i++) {
            sum += statistic[i];
        }
        int meanSale = sum / statistic.length;
        int underMeanMonth = 0;

        for (int i = 0; i < statistic.length; i++) {
            if (statistic[i] < meanSale) {
                underMeanMonth++;
            }
        }
        return underMeanMonth;
    }

    public long upMeanSales(long[] statistic) {

        int sum = 0;

        for (int i = 0; i < statistic.length; i++) {
            sum += statistic[i];
        }
        int meanSale = sum / statistic.length;
        int underMeanMonth = 0;

        for (int i = 0; i < statistic.length; i++) {
            if (statistic[i] > meanSale) {
                underMeanMonth++;
            }
        }
        return underMeanMonth;
    }
}
