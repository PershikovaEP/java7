package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) { //месяц с минимальными продажами
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

    public int maxSales(long[] sales) { //месяц с максимальными продажами
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long sumSales(long[] sales) { //сумма всех продаж

        long sum = 0; // начальная сумма
        for (long sale : sales) {
             // sale - продажи в рассматриваемом месяце
            long sumMonth = sale + sum;
            sum = sumMonth;
        }
        return sum;
    }

    public long middleSumSales(long[] sales) { //средняя сумма всех продаж

        long middleSum = sumSales(sales) / sales.length;
        return middleSum;
    }

    public int minMiddleSum(long[] sales) { //количество месяцев с продажами ниже среднего

        int month = 0; // количество месяцев с суммами продаж ниже среднего
        for (long sale : sales) {
            // middleSumSales(sales) - сумма средних продаж
            // sale - продажи в рассматриваемом месяце
            if (sale < middleSumSales(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

    public int maxMiddleSum(long[] sales) { //количество месяцев с продажами выше среднего

        int month = 0; // количество месяцев с суммами продаж выше среднего
        for (long sale : sales) {
            // middleSumSales(sales) - сумма средних продаж
            // sale - продажи в рассматриваемом месяце
            if (sale > middleSumSales(sales)) {
                month = month + 1;
            }
        }
        return month;
    }
}


