package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    //1
    @Test
    void showldCalculateSumSales() {

        // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //2
    @Test
    void showldCalculateAverageSales() {

        // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.averageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //3
    @Test
    void showldCalculateMinSales() {

        // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //4
    @Test
    void showldCalculateMaxSales() {

        // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //5
    @Test
    void showldCalculateMonthCountLowSales() {

        // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.monthCountLowSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //6
    @Test
    void showldCalculateMonthCountHighSales() {

        // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.monthCountHighSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}