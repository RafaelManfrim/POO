package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class CameraDeSeguranca extends Dispositivo {

  public CameraDeSeguranca(String nome, String ambiente) {
    super(nome, ambiente);
  }
  
  @Override
  public String getTipo() {
      return "Câmera de Segurança";
  }
}