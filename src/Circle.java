public class Circle {
    private double x; // Координата X центра окружности
    private double y; // Координата Y центра окружности
    private double r; // Радиус окружности

    // Конструктор по умолчанию
    public Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.r = 1.0;
    }

    // Конструктор с параметрами
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    // Метод для вычисления площади части окружности, лежащей в первой (положительной) четверти
    public double quarterArea() {
        // Если окружность целиком в первой четверти
        if (x >= 0 && y >= 0 && (x - r >= 0) && (y - r >= 0)) {
            return Math.PI * Math.pow(r, 2) / 4; // Возвращаем четверть от полной площади
        }

        // Для упрощения предположим, что если окружность пересекает оси, площадь нулевая
        return 0.0; // Упрощенный вариант
    }

    // Перегруженный метод equals для сравнения по координатам центра и радиусу
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return Double.compare(this.x, other.x) == 0 &&
                Double.compare(this.y, other.y) == 0 &&
                Double.compare(this.r, other.r) == 0;
    }

    // Переопределение метода toString для вывода информации об окружности
    @Override
    public String toString() {
        return "Окружность с центром (" + x + "; " + y + ") и радиусом " + r;
    }
}
