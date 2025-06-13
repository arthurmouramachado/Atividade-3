public class Troco {
    private double precoUnitario;
    private int quantidade;
    private double dinheiroRecebido;
    
    public Troco(double precoUnitario, int quantidade, double dinheiroRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.dinheiroRecebido = dinheiroRecebido;
    }
    
    
    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public double getDinheiroRecebido() { return dinheiroRecebido; }
    public void setDinheiroRecebido(double dinheiroRecebido) { this.dinheiroRecebido = dinheiroRecebido; }
    
    public void calcularTroco() {
        double total = precoUnitario * quantidade;
        if (dinheiroRecebido >= total) {
            double troco = dinheiroRecebido - total;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double falta = total - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", falta);
        }
    }
}
