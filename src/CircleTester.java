import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод координат и радиуса первой окружности
        System.out.print("Введите х-координату первой окружности: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите у-координату первой окружности: ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите радиус первой окружности: ");
        double r1 = scanner.nextDouble();
        Circle circle1 = new Circle(x1, y1, r1);

        // Ввод координат и радиуса второй окружности
        System.out.print("Введите х-координату второй окружности: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите у-координату второй окружности: ");
        double y2 = scanner.nextDouble();
        System.out.print("Введите радиус второй окружности: ");
        double r2 = scanner.nextDouble();
        Circle circle2 = new Circle(x2, y2, r2);

        // Вывод информации о первой и второй окружностях
        System.out.println("\nИнформация о первой окружности:");
        System.out.println(circle1);
        System.out.println("\nИнформация о второй окружности:");
        System.out.println(circle2);

        // Вычисление площади части окружности в первой четверти
        System.out.println("\nПлощадь первой окружности в первой четверти: " + circle1.quarterArea());
        System.out.println("Площадь второй окружности в первой четверти: " + circle2.quarterArea());

        // Сравнение окружностей
        if (circle1.equals(circle2)) {
            System.out.println("\nОкружности совпадают по центру и радиусу.");
        } else {
            System.out.println("\nОкружности различаются по центру или радиусу.");
        }
    }
}
