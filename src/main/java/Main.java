import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] array = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        System.out.println("месяц с минимальными продажами " + service.minSales(array));
        System.out.println("месяц с максимальными продажами " + service.maxSales(array));
        System.out.println("сумма продаж " + service.sumSales(array));
        System.out.println("средняя сумма продаж " + service.middleSumSales(array));
        System.out.println("количество месяцев с продажами ниже среднего " + service.minMiddleSum(array));
        System.out.println("количество месяцев с продажами выше среднего " + service.maxMiddleSum(array));



    }
}
