package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class Lampada extends Dispositivo {
    private int brilho; // 0-100%

    public Lampada(String nome, String ambiente) {
        super(nome, ambiente);
        ajustarBrilho(0);
    }

    public Lampada(String nome, String ambiente, int brilho) {
        super(nome, ambiente);
        ajustarBrilho(brilho);
    }

    @Override
    public String getTipo() {
        return "Lâmpada";
    }

    public void ajustarBrilho(int brilho) {
        if (brilho < 0 || brilho > 100) {
            throw new IllegalArgumentException("O brilho deve estar entre 0% e 100%");
        }

        this.brilho = brilho;
        if (brilho > 0) {
            ligar();
        } else {
            desligar();
        }
    }

    public int getBrilho() {
        return brilho;
    }

    @Override
    public String getEstado() {
        return isLigado() ? "Ligada (" + brilho + "%)" : "Desligada";
    }
}