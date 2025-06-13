public class Lanchonete {
    private int codigo;
    private int quantidade;
    
    public Lanchonete(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    
   
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    
    public double calcularValor() {
        double preco = 0;
        switch (codigo) {
            case 1: preco = 5.00; break;
            case 2: preco = 3.50; break;
            case 3: preco = 4.80; break;
            case 4: preco = 8.90; break;
            case 5: preco = 7.32; break;
            default: System.out.println("Código inválido!");
        }
        return preco * quantidade;
    }
}
