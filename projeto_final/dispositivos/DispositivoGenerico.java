package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class DispositivoGenerico extends Dispositivo {
  public DispositivoGenerico(String nome, String ambiente) {
    super(nome, ambiente);
  }

  @Override
  public String getTipo() {
    return "Dispositivo Genérico";
  }
}