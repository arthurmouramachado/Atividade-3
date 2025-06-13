public class Jogo {
    private int horaInicial;
    private int horaFinal;
    
    public Jogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }
    
   
    public int getHoraInicial() { return horaInicial; }
    public void setHoraInicial(int horaInicial) { this.horaInicial = horaInicial; }
    public int getHoraFinal() { return horaFinal; }
    public void setHoraFinal(int horaFinal) { this.horaFinal = horaFinal; }
    
    public int calcularDuracao() {
        if (horaInicial < horaFinal) {
            return horaFinal - horaInicial;
        } else {
            return 24 - horaInicial + horaFinal;
        }
    }
}