public class Bhaskara {
    private double a;
    private double b;
    private double c;
    
    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA() { return a; }
    public void setA(double a) { this.a = a; }
    public double getB() { return b; }
    public void setB(double b) { this.b = b; }
    public double getC() { return c; }
    public void setC(double c) { this.c = c; }
    
    public void calcularRaizes() {
        double delta = b * b - 4 * a * c;
        
        if (delta < 0 || a == 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        }
    }
}
