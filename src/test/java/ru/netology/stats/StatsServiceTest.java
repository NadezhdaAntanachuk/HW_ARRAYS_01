package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void showldCalculateSumSales() {

        // подготавливаем данные:
        long Sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.sumSales(Sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showldCalculateAverageSales() {

        // подготавливаем данные:
        long Sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / Sales.length;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.averageSales(Sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showldCalculateMinSales() {

        // подготавливаем данные:
        long Sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.minSales(Sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showldCalculateMaxSales() {

        // подготавливаем данные:
        long Sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.maxSales(Sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showldCalculateMonthCountHighSales() {

        // подготавливаем данные:
        long Sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        StatsService service = new StatsService();

        // вызываем целевой метод:
        long actual = service.monthCountHighSales(Sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}