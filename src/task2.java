import java.awt.*;
import java.util.function.BiFunction;
import java.util.function.Function;

import static java.lang.Math.*;

public class task2 {
    public static void main(String[] args) {
        System.out.println(task1.apply(90, 10));
        System.out.println(task2(90, 10, 25, 32));
        System.out.println(task3(new Point(8, 8), new Point(4, -8), new Point(6, 0)));
        System.out.println(task4(5, 10, 5, 8, 10));
        System.out.println(task5(2));

    }

    public static BiFunction<Integer, Integer, String> task1 = (firstDeg, secondDeg) -> {
        if ((firstDeg + secondDeg >= 180) || firstDeg != 0 || secondDeg != 0)
            return "Triangle doesn't exist";
        else if (firstDeg == 90 || secondDeg == 90 || (180 - firstDeg - secondDeg == 90))
            return "right triangle";
        return null;
    };

    public static int task2(int a, int b, int c, int d) {
        return max(min(a, b), min(c, d));
    }

    public static boolean task3(Point first, Point second, Point third) {
        return (third.y == ((third.x - first.x) * (second.y - first.y)) / (second.x - first.x) + first.y);
    }

    public static boolean task4(int a, int b, int x, int y, int z) {
        return (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b);
    }

    public static double task5(int x) {
        if (x <= 3)
            return x * x - 3 * x + 9;
        return 1 / (pow(x, 3) + 6);
    }

}
