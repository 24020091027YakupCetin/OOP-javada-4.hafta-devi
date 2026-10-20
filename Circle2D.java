public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // Varsayılan yapıcı metot (0,0) merkezli ve 1 yarıçaplı
    public Circle2D() {
        this(0, 0, 1);
    }

    // Parametreli yapıcı metot
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter metotları
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Alan hesabı
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Çevre hesabı
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Verilen (x, y) noktasının çemberin içinde olup olmadığını kontrol eder
    public boolean contains(double x, double y) {
        double distance = Math.hypot(this.x - x, this.y - y);
        return distance < radius;
    }

    // Verilen çemberin tamamen bu çemberin içinde olup olmadığını kontrol eder
    public boolean contains(Circle2D circle) {
        double distance = Math.hypot(this.x - circle.getX(), this.y - circle.getY());
        return distance + circle.getRadius() <= radius;
    }

    // Verilen çemberin bu çemberle kesişip/örtüşmediğini kontrol eder
    public boolean overlaps(Circle2D circle) {
        double distance = Math.hypot(this.x - circle.getX(), this.y - circle.getY());
        return distance < (radius + circle.getRadius());
    }
}