public class Lampada {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private boolean ligada;

    // Construtor
    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.ligada = false; // inicia desligada
    }

    // Métodos
    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada " + modelo + " está LIGADA.");
        } else {
            System.out.println("A lâmpada " + modelo + " está DESLIGADA.");
        }
    }
}
