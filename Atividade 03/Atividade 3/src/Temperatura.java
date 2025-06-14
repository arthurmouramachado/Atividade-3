public class Temperatura {
    private char escala;
    private double temp;
    
    public Temperatura(char escala, double temp) {
        this.escala = escala;
        this.temp = temp;
    }
    
    
    public char getEscala() { return escala; }
    public void setEscala(char escala) { this.escala = escala; }
    public double getTemp() { return temp; }
    public void setTemp(double temp) { this.temp = temp; }
    
    public void converterTemperatura() {
        if (escala == 'F' || escala == 'f') {
            double celsius = (5.0 / 9.0) * (temp - 32);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", celsius);
        } else if (escala == 'C' || escala == 'c') {
            double fahrenheit = (temp * 9.0 / 5.0) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", fahrenheit);
        } else {
            System.out.println("Escala inválida!");
        }
    }
}
