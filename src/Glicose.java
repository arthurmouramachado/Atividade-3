public class Glicose {
    private double medida;
    
    public Glicose(double medida) {
        this.medida = medida;
    }
    
   
    public double getMedida() { return medida; }
    public void setMedida(double medida) { this.medida = medida; }
    
    public String classificarGlicose() {
        if (medida <= 100) return "normal";
        else if (medida <= 140) return "elevado";
        else return "diabetes";
    }
}
