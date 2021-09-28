package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
// массив с суммами месячных продаж

    // проверим метод нахождения общей суммы продаж
    @Test
    void shouldSumSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    // проверим метод нахождения средней суммы продаж
    @Test
    void shouldAverageSumSales() {

        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSumSales(sales);
        assertEquals(expected, actual);
    }

    // проверим метод нахождения месяца с максимальными продажами
    @Test
    void shouldmaxSales() {

        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }


    // проверим метод нахождения кол-ва  месяцев с продажами ниже среднего
    @Test
    void shouldMonthsBelowAverage() {

        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    // проверим метод нахождения кол-ва  месяцев с продажами выше среднего
    @Test
    void shouldMonthsOverAverage() {

        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthsOverAverage(sales);
        assertEquals(expected, actual);
    }
}