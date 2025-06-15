package projeto_final;

import java.util.ArrayList;
import java.util.List;

public class Ambiente {
  private String nome;
  private List<Dispositivo> dispositivos;

  public Ambiente(String nome) {
    this.nome = nome;
    this.dispositivos = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Dispositivo> getDispositivos() {
    return dispositivos;
  }

  public void adicionarDispositivo(Dispositivo dispositivo) {
    dispositivos.add(dispositivo);
  }

  public void removerDispositivo(Dispositivo dispositivo) {
    dispositivos.remove(dispositivo);
  }
}