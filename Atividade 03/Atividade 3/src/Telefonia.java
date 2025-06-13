public class Telefonia {
    private int minutos;
    
    public Telefonia(int minutos) {
        this.minutos = minutos;
    }
    
    
    public int getMinutos() { return minutos; }
    public void setMinutos(int minutos) { this.minutos = minutos; }
    
    public double calcularValorPlano() {
        double valor = 50.0;
        if (minutos > 100) {
            valor += (minutos - 100) * 2.0;
        }
        return valor;
    }
}