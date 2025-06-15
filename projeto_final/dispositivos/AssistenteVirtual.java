package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class AssistenteVirtual extends Dispositivo {
  private String musicaAtual;

  public AssistenteVirtual(String nome, String ambiente) {
    super(nome, ambiente);
  }

  @Override
  public String getTipo() {
    return "Assistente Virtual";
  }

  public void tocarMusica(String musica) {
    if (musica == null || musica.isEmpty()) {
      throw new IllegalArgumentException("A música não pode ser nula ou vazia.");
    }
    this.musicaAtual = musica;
  }

  public String getMusicaAtual() {
    return musicaAtual;
  }

  @Override
  public void ligar() {
    super.ligar();
    this.musicaAtual = null; // Reseta a música atual ao ligar
  }

  @Override
  public void desligar() {
    super.desligar();
    this.musicaAtual = null; // Reseta a música atual ao desligar
  }

  @Override
  public String getEstado() {
    if (isLigado()) {
      return "Ligada" + (musicaAtual != null ? " - Tocando: " + musicaAtual : "");
    } else {
      return "Desligada";
    }
  }
}