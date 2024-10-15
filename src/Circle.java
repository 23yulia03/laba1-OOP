public class Circle {
    private double x; // ���������� X ������ ����������
    private double y; // ���������� Y ������ ����������
    private double r; // ������ ����������

    // ����������� �� ���������
    public Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.r = 1.0;
    }

    // ����������� � �����������
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // �������
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    // ����� ��� ���������� ������� ����� ����������, ������� � ������ (�������������) ��������
    public double quarterArea() {
        // ���� ���������� ������� � ������ ��������
        if (x >= 0 && y >= 0 && (x - r >= 0) && (y - r >= 0)) {
            return Math.PI * Math.pow(r, 2) / 4; // ���������� �������� �� ������ �������
        }

        // ��� ��������� �����������, ��� ���� ���������� ���������� ���, ������� �������
        return 0.0; // ���������� �������
    }

    // ������������� ����� equals ��� ��������� �� ����������� ������ � �������
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

    // ��������������� ������ toString ��� ������ ���������� �� ����������
    @Override
    public String toString() {
        return "���������� � ������� (" + x + "; " + y + ") � �������� " + r;
    }
}
