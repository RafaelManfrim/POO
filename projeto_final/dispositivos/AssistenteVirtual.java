package projeto_final.dispositivos;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class AssistenteVirtual extends Dispositivo {

  public AssistenteVirtual(String nome, String ambiente) {
    super(nome, ambiente);
  }

  @Override
  public String getTipo() {
      return "Assistente Virtual";
  }
}