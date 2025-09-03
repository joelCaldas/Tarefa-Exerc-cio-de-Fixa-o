public class prog {
    public static void main(String[] args) {
        Lampada lampadaLed = new Lampada("Philips", "110V", 20, "Branca", "LED", 12);

        lampadaLed.mostrarEstado(); 
        lampadaLed.ligar();
        lampadaLed.mostrarEstado(); 
        lampadaLed.desligar();
        lampadaLed.mostrarEstado(); 
    }
}
