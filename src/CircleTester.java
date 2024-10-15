import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ���� ��������� � ������� ������ ����������
        System.out.print("������� �-���������� ������ ����������: ");
        double x1 = scanner.nextDouble();
        System.out.print("������� �-���������� ������ ����������: ");
        double y1 = scanner.nextDouble();
        System.out.print("������� ������ ������ ����������: ");
        double r1 = scanner.nextDouble();
        Circle circle1 = new Circle(x1, y1, r1);

        // ���� ��������� � ������� ������ ����������
        System.out.print("������� �-���������� ������ ����������: ");
        double x2 = scanner.nextDouble();
        System.out.print("������� �-���������� ������ ����������: ");
        double y2 = scanner.nextDouble();
        System.out.print("������� ������ ������ ����������: ");
        double r2 = scanner.nextDouble();
        Circle circle2 = new Circle(x2, y2, r2);

        // ����� ���������� � ������ � ������ �����������
        System.out.println("\n���������� � ������ ����������:");
        System.out.println(circle1);
        System.out.println("\n���������� � ������ ����������:");
        System.out.println(circle2);

        // ���������� ������� ����� ���������� � ������ ��������
        System.out.println("\n������� ������ ���������� � ������ ��������: " + circle1.quarterArea());
        System.out.println("������� ������ ���������� � ������ ��������: " + circle2.quarterArea());

        // ��������� �����������
        if (circle1.equals(circle2)) {
            System.out.println("\n���������� ��������� �� ������ � �������.");
        } else {
            System.out.println("\n���������� ����������� �� ������ ��� �������.");
        }
    }
}
