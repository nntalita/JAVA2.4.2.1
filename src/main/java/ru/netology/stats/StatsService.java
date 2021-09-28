package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public long sumSales(long[] sales) {
        long sumYear = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            sumYear += sale;
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return sumYear;
    }

    // Cредняя сумма  продаж
    public long averageSumSales(long[] sales) {
        return sumSales(sales) / sales.length; // вызовем метод, который находит сумму и разделим на колчество месяцев
    }

    // месяц, в котором были максимальные продажи
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // месяц, в котором быми минимальные продажи
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int monthsBelowAverage(long[] sales) {
        long average = averageSumSales(sales); // вызов метода, находящего среднюю сумму продаж
        int sumMonths = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {      // sale - продажи в рассматриваемом месяце
            if (sale < average) {
                sumMonths = sumMonths + 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return sumMonths;

    }

    // количество месяцев, в которых продажи были выше среднего
    public int monthsOverAverage(long[] sales) {
        long average = averageSumSales(sales); // вызов метода, находящего среднюю сумму продаж
        int sumMonths = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {      // sale - продажи в рассматриваемом месяце
            if (sale > average) {
                sumMonths = sumMonths + 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return sumMonths;

    }
}