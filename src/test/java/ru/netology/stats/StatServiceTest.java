package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatServiceTest {

    @Test
    public void shouldFindBetweenEnd() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindEnd() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 21 };
        int expectedMonth = 12;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCountPositiveValues() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expectedMonth = 180;
        long actualMonth = service.sumSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void souldCalcWithZero() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 0, 7, 14, 14, 18 };
        long expectedMonth = 13;   //(160/12)
        long actualMonth = service.middleSumSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void mustCalcWithNegativeValue() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, -1, 14, 14, 18 };
        int expectedMonth = 3;  //среднее 14
        int actualMonth = service.minMiddleSum(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void mustCalcSalesEqualMiddle() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMonth = 5;
        int actualMonth = service.maxMiddleSum(sales); //среднее
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}
