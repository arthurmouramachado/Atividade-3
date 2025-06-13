public class Salario {
    private double salarioAtual;
    
    public Salario(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }
    
    // Getters e Setters
    public double getSalarioAtual() { return salarioAtual; }
    public void setSalarioAtual(double salarioAtual) { this.salarioAtual = salarioAtual; }
    
    public void calcularAumento() {
        double aumento = 0;
        double porcentagem = 0;
        
        if (salarioAtual <= 1000.0) {
            porcentagem = 20;
        } else if (salarioAtual <= 3000.0) {
            porcentagem = 15;
        } else if (salarioAtual <= 8000.0) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }
        
        aumento = salarioAtual * porcentagem / 100;
        double novoSalario = salarioAtual + aumento;
        
        System.out.printf("Novo salario R$ %.2f%n", novoSalario);
        System.out.printf("Aumento R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %.0f%%%n", porcentagem);
    }
}