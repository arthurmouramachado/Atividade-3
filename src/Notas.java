public class Notas {
    private double nota1;
    private double nota2;
    
    public Notas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double getNota1() {
        return nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public void calcularNotaFinal() {
        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }
    }
}