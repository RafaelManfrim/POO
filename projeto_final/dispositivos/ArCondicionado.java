package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class ArCondicionado extends Dispositivo {
    private int temperatura; // 16-30°C

    public ArCondicionado(String nome, String ambiente) {
        super(nome, ambiente);
        this.temperatura = 22; // temperatura padrão
    }

    public ArCondicionado(String nome, Ambiente ambiente, int temperatura) {
        super(nome, ambiente.getNome());
        this.ajustarTemperatura(temperatura);
    }

    @Override
    public String getTipo() {
        return "Ar Condicionado";
    }

    public void ajustarTemperatura(int temperatura) {
        if (temperatura < 16 || temperatura > 30) {
            throw new IllegalArgumentException("Temperatura deve estar entre 16 e 30°C");
        }

        this.temperatura = temperatura;
        ligar();
    }

    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public String getEstado() {
        return isLigado() ? "Ligado (" + temperatura + "°C)" : "Desligado";
    }
}
