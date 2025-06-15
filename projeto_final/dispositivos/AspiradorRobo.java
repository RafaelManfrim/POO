package projeto_final.dispositivos;

import java.time.LocalTime;
import java.time.Duration;

import projeto_final.Dispositivo;
import projeto_final.Estado;
import projeto_final.Ambiente;

public class AspiradorRobo extends Dispositivo {
  private static final int TEMPO_LIMPEZA_PADRAO = 30; // minutos
  private LocalTime horaLimpezaIniciada;
  private int tempoLimpeza; // em minutos

  public AspiradorRobo(String nome, String ambiente) {
    super(nome, ambiente);
    this.tempoLimpeza = TEMPO_LIMPEZA_PADRAO; // tempo de limpeza padrão
  }

  @Override
  public String getTipo() {
    return "Aspirador Robô";
  }

  public void configurarTempoLimpeza(int minutos) {
    if (minutos <= 0) {
      throw new IllegalArgumentException("O tempo de limpeza deve ser maior que zero.");
    }
    this.tempoLimpeza = minutos;
  }

  public int getTempoLimpeza() {
    return tempoLimpeza;
  }

  @Override
  public void ligar() {
    super.ligar();
    this.horaLimpezaIniciada = LocalTime.now();
  }

  @Override
  public void desligar() {
    super.desligar();
    this.horaLimpezaIniciada = null; // Reseta a hora de limpeza iniciada
  }

  @Override
  public String getEstado() {
    if (horaLimpezaIniciada == null) {
      return "Desligado";
    }

    LocalTime horarioFinal = this.horaLimpezaIniciada.plusMinutes(tempoLimpeza);
    long minutosRestantes = Duration.between(LocalTime.now(), horarioFinal).toMinutes();
    int tempoLimpeza = (int) minutosRestantes;
    if (tempoLimpeza < 0) {
      tempoLimpeza = 0; // Se o tempo de limpeza já passou, consideramos como 0 minutos restantes
    }

    if (isLigado() && tempoLimpeza > 0) {
      return "Ligado (Tempo de limpeza restante: " + tempoLimpeza + " minutos)";
    } else {
      super.desligar();
      this.horaLimpezaIniciada = null; // Reseta a hora de limpeza iniciada
      return "Desligado";
    }
  }
}