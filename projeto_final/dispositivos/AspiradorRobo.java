package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class AspiradorRobo extends Dispositivo {

  public AspiradorRobo(String nome, String ambiente) {
    super(nome, ambiente);
  }

  @Override
  public String getTipo() {
    return "Aspirador Robô";
  }
}