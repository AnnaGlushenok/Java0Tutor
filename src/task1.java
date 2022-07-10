import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

import static java.lang.Math.*;

public class task1 {
    public static void main(String[] args) {
        System.out.println(task1(1, 2, 3));
        System.out.println(task2(3, 4, 5));
        System.out.println(task3.apply(1, 1));
        System.out.println(task4.apply(123.456));
        System.out.println(task5.apply(47055L));
        System.out.println(task6.test(4,-2));

    }

    public static double task1(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double task2(double a, double b, double c) {
        return (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
    }

    public static BiFunction<Integer, Integer, Double> task3 = (x, y) -> ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);

    public static Function<Double, Double> task4 = (number) ->
            Double.parseDouble(String.valueOf(new StringBuilder(String.valueOf(number)).reverse()));

    public static Function<Long, String> task5 = (seconds) ->
            String.format("%02dh %02dmin %02ds", seconds / 3600, seconds / 60 % 60, seconds % 60);

    public static BiPredicate<Integer, Integer> task6 = (x, y) ->
            ((x >= -2 && x <= 2 && y >= 0 && y <= 4) ||
                    (x >= -4 && x <= 4 && y >= -3 && y <= 0) && (x != 0 && y != -1));

}