package ru.netology.stats;

public class StatsService {

    public int sum(int[] statistic) {

        int sum = 0;

        for (int i = 0; i < statistic.length; i++) {

            sum += statistic[i];
        }
        return sum;
    }

    public int meanSum(int[] statistic) {

        int sum = sum(statistic);
        int meanSale = sum / statistic.length;

        return meanSale;
    }

    public int maxSales(int[] statistic) {

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

    public int minSales(int[] statistic) {

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

    public int underMeanSales(int[] statistic) {
        int sum = sum(statistic);
        int meanSale = sum / statistic.length;
        int underMeanMonth = 0;

        for (int i = 0; i < statistic.length; i++) {

            if (statistic[i] < meanSale) {
                underMeanMonth++;
            }
        }
        return underMeanMonth;
    }

    public int upMeanSales(int[] statistic) {

        int sum = sum(statistic);
        int meanSale = sum / statistic.length;
        int upMeanMonth = 0;

        for (int i = 0; i < statistic.length; i++) {
            if (statistic[i] > meanSale) {
                upMeanMonth++;
            }
        }
        return upMeanMonth;
    }
}


