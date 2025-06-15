package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class CameraDeSeguranca extends Dispositivo {
  private boolean gravandoNaMemoria = false;

  public CameraDeSeguranca(String nome, String ambiente) {
    super(nome, ambiente);
  }
  
  @Override
  public String getTipo() {
    return "Câmera de Segurança";
  }

  public void iniciarGravacao() {
    super.ligar(); // Liga o dispositivo
    this.gravandoNaMemoria = true;
  }

  public void pararGravacao() {
    this.gravandoNaMemoria = false;
  }

  public boolean isGravando() {
    return gravandoNaMemoria;
  }

  @Override
  public void ligar() {
    super.ligar();
    this.gravandoNaMemoria = false; // Reseta o estado de gravação ao ligar
  }

  @Override
  public void desligar() {
    super.desligar();
    this.gravandoNaMemoria = false; // Reseta o estado de gravação ao desligar
  }

  @Override
  public String getEstado() {
    String estado = super.getEstado();
    if (isLigado()) {
      estado += " - " + (gravandoNaMemoria ? "Gravando" : "Não está gravando");
    }
    return estado;
  }
}