package ru.netology.stats;

public class StatsService {

    //1 сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    //2 средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        if (sales.length > 0) {
            return sumSales(sales) / sales.length;
        } else {
            return 0;
        }
    }

    //3 номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //4 номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int maxSales(long[] sales) {
        int minMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                minMonth = i; // запомним его как максимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //5 количество месяцев, в которых продажи были ниже среднего (см. п.2)
    public int monthCountLowSales(long[] sales) {
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            long avgSales = averageSales(sales);
            if (sales[i] < avgSales) {
                countMonth++;
            }
        }

        return countMonth;
    }

    //6 количество месяцев, в которых продажи были выше среднего (см. п.2)
    public int monthCountHighSales(long[] sales) {
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            long avgSales = averageSales(sales);
            if (sales[i] > avgSales) {
                countMonth++;
            }
        }

        return countMonth;
    }

}
