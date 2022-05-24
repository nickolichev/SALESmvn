package ru.netology.stats;

public class StatsService {

    public int sum(int[] statistic) {

        statistic[0] = 8;
        statistic[1] = 15;
        statistic[2] = 13;
        statistic[3] = 15;
        statistic[4] = 17;
        statistic[5] = 20;
        statistic[6] = 19;
        statistic[7] = 20;
        statistic[8] = 7;
        statistic[9] = 14;
        statistic[10] = 14;
        statistic[11] = 18;

        int sum = 0;

        for (int i = 0; i < statistic.length; i++) {

            sum += statistic[i];
        }
        return sum;
    }

    public double meanSum(long[] statistic) {

        statistic[0] = 8;
        statistic[1] = 15;
        statistic[2] = 13;
        statistic[3] = 15;
        statistic[4] = 17;
        statistic[5] = 20;
        statistic[6] = 19;
        statistic[7] = 20;
        statistic[8] = 7;
        statistic[9] = 14;
        statistic[10] = 14;
        statistic[11] = 18;

        int sum = 0;

        for (int i = 0; i < statistic.length; i++) {

            sum += statistic[i];

        }
        return sum / statistic.length;
    }

    public long maxSales(long[] statistic) {

        statistic[0] = 8;
        statistic[1] = 15;
        statistic[2] = 13;
        statistic[3] = 15;
        statistic[4] = 17;
        statistic[5] = 20;
        statistic[6] = 19;
        statistic[7] = 20;
        statistic[8] = 7;
        statistic[9] = 14;
        statistic[10] = 14;
        statistic[11] = 18;

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

        statistic[0] = 8;
        statistic[1] = 15;
        statistic[2] = 13;
        statistic[3] = 15;
        statistic[4] = 17;
        statistic[5] = 20;
        statistic[6] = 19;
        statistic[7] = 20;
        statistic[8] = 7;
        statistic[9] = 14;
        statistic[10] = 14;
        statistic[11] = 18;

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

        statistic[0] = 8;
        statistic[1] = 15;
        statistic[2] = 13;
        statistic[3] = 15;
        statistic[4] = 17;
        statistic[5] = 20;
        statistic[6] = 19;
        statistic[7] = 20;
        statistic[8] = 7;
        statistic[9] = 14;
        statistic[10] = 14;
        statistic[11] = 18;

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

        statistic[0] = 8;
        statistic[1] = 15;
        statistic[2] = 13;
        statistic[3] = 15;
        statistic[4] = 17;
        statistic[5] = 20;
        statistic[6] = 19;
        statistic[7] = 20;
        statistic[8] = 7;
        statistic[9] = 14;
        statistic[10] = 14;
        statistic[11] = 18;

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
