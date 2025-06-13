public class Coordenadas {
    private double x;
    private double y;
    
    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    
    public String determinarQuadrante() {
        if (x == 0 && y == 0) return "Origem";
        else if (x == 0) return "Eixo Y";
        else if (y == 0) return "Eixo X";
        else if (x > 0 && y > 0) return "Q1";
        else if (x < 0 && y > 0) return "Q2";
        else if (x < 0 && y < 0) return "Q3";
        else return "Q4";
    }
}