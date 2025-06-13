public class Dardo {
    private double dist1;
    private double dist2;
    private double dist3;
    
    public Dardo(double dist1, double dist2, double dist3) {
        this.dist1 = dist1;
        this.dist2 = dist2;
        this.dist3 = dist3;
    }
    
    
    public double getDist1() { return dist1; }
    public void setDist1(double dist1) { this.dist1 = dist1; }
    public double getDist2() { return dist2; }
    public void setDist2(double dist2) { this.dist2 = dist2; }
    public double getDist3() { return dist3; }
    public void setDist3(double dist3) { this.dist3 = dist3; }
    
    public double encontrarMaiorDistancia() {
        double maior = dist1;
        if (dist2 > maior) maior = dist2;
        if (dist3 > maior) maior = dist3;
        return maior;
    }
}
