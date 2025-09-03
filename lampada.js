class Lampada {
    constructor(modelo, tensao, potencia, cor, tipoLuz, garantiaMeses) {
        this.modelo = modelo;          // String
        this.tensao = tensao;          // String
        this.potencia = potencia;      // int
        this.cor = cor;                // String
        this.tipoLuz = tipoLuz;        // String
        this.garantiaMeses = garantiaMeses; // int
        this.ligada = false;           // boolean
    }

    ligar() {
        this.ligada = true;
        console.log("A lâmpada foi ligada.");
    }

    desligar() {
        this.ligada = false;
        console.log("A lâmpada foi desligada.");
    }

    mostrarEstado() {
        if (this.ligada) {
            console.log(`A lâmpada ${this.modelo} está LIGADA.`);
        } else {
            console.log(`A lâmpada ${this.modelo} está DESLIGADA.`);
        }
    }
}


const lampadaLed = new Lampada("Philips", "110V", 20, "Branca", "LED", 12);

lampadaLed.mostrarEstado(); // Desligada
lampadaLed.ligar();
lampadaLed.mostrarEstado(); // Ligada
lampadaLed.desligar();
lampadaLed.mostrarEstado(); // Desligada


