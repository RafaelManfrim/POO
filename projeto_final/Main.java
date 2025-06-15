package projeto_final;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import projeto_final.dispositivos.Lampada;
import projeto_final.dispositivos.ArCondicionado;
import projeto_final.dispositivos.AspiradorRobo;
import projeto_final.dispositivos.AssistenteVirtual;
import projeto_final.dispositivos.CameraDeSeguranca;
import projeto_final.dispositivos.DispositivoGenerico;

public class Main {
  static ArrayList<Ambiente> ambientes = new ArrayList<>();
  static ArrayList<Dispositivo> dispositivos = new ArrayList<>();
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Boas vindas ao sistema de automação residencial!");
    
    try {
      while (true) {
        System.out.println("\n========== Menu Principal ==========");
        System.out.println("1. Gerenciar Ambientes");
        System.out.println("2. Gerenciar Dispositivos");
        System.out.println("3. Relatórios");
        System.out.println("4. Sair");
        System.out.print("Selecione uma opção: ");

        int opcao = capturarOpcao(1, 4);

        switch (opcao) {
          case 1:
            gerenciarAmbientes();
            break;
          case 2:
            gerenciarDispositivos();
            break;
          case 3:
            mostrarRelatorios();
            break;
          case 4:
            System.out.println("Saindo do sistema...");
            return;
          default:
            System.out.println("Opção inválida! Tente novamente.");
        }
      }
    } finally {
      scanner.close();
    }
  }

  private static int capturarOpcao(int min, int max) {
    while (true) {
      try {
        int opcao = Integer.parseInt(scanner.nextLine());
        if (opcao >= min && opcao <= max) {
          return opcao;
        }
        System.out.println("Opção inválida! Digite um número entre " + min + " e " + max);
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida! Digite um número.");
      }
    }
  }

  private static void gerenciarAmbientes() {
    while (true) {
      System.out.println("\n--------- Gerenciamento de Ambientes ---------");
      System.out.println("1. Adicionar Ambiente");
      System.out.println("2. Remover Ambiente");
      System.out.println("3. Listar Ambientes");
      System.out.println("4. Voltar");
      System.out.print("Selecione uma opção: ");

      int opcao = capturarOpcao(1, 4);

      switch (opcao) {
        case 1:
          adicionarAmbiente();
          break;
        case 2:
          removerAmbiente();
          break;
        case 3:
          listarAmbientes();
          break;
        case 4:
          return;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }
  }

  private static void adicionarAmbiente() {
    System.out.print("Digite o nome do ambiente: ");
    String nome = scanner.nextLine();

    Ambiente ambiente = new Ambiente(nome);
    ambientes.add(ambiente);

    System.out.println("\nAmbiente " + ambiente.getNome() + " adicionado com sucesso!\n");
  }

  private static void removerAmbiente() {
      if (ambientes.isEmpty()) {
          System.out.println("\nNenhum ambiente cadastrado para remover.");
          return;
      }

      System.out.println("\nAmbientes disponíveis para remoção:");
      for (int i = 0; i < ambientes.size(); i++) {
          System.out.println((i + 1) + ". " + ambientes.get(i).getNome());
      }

      System.out.print("Digite o número do ambiente a ser removido: ");
      int indice = capturarOpcao(1, ambientes.size()) - 1;

      System.out.println("\nVocê está prestes a remover o ambiente (Todos os dispositivos nele serão excluídos): " + ambientes.get(indice).getNome());
      System.out.print("Tem certeza? (s/n): ");
      String confirmacao = scanner.nextLine().trim().toLowerCase();
      if (!confirmacao.toLowerCase().equals("s")) {
          System.out.println("Remoção cancelada.");
          return;
      }

      Ambiente ambienteRemovido = ambientes.get(indice);

      for (Dispositivo dispositivo : ambienteRemovido.getDispositivos()) {
        dispositivos.remove(dispositivo);
      }

      String nomeRemovido = ambientes.remove(indice).getNome();
      System.out.println("Ambiente '" + nomeRemovido + "' removido com sucesso!");
  }

  private static void listarAmbientes() {
      if (ambientes.isEmpty()) {
          System.out.println("\nNenhum ambiente cadastrado.");
          return;
      }

      System.out.println("\nAmbientes cadastrados:");
      for (int i = 0; i < ambientes.size(); i++) {
          System.out.println((i + 1) + ". " + ambientes.get(i).getNome());
      }
  }

  private static void gerenciarDispositivos() {
    while (true) {
      System.out.println("\n---------- Gerenciamento de Dispositivos ----------");
      System.out.println("1. Adicionar Dispositivo");
      System.out.println("2. Remover Dispositivo");
      System.out.println("3. Listar Dispositivos");
      System.out.println("4. Controlar Dispositivo");
      System.out.println("5. Voltar");
      System.out.print("Selecione uma opção: ");

      int opcao = capturarOpcao(1, 5);

      switch (opcao) {
        case 1:
          adicionarDispositivo();
          break;
        case 2:
          removerDispositivo();
          break;
        case 3:
          listarDispositivos();
          break;
        case 4:
          controlarDispositivos();
          break;
        case 5:
          return;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }
  }

  private static void adicionarDispositivo() {
      if (ambientes.isEmpty()) {
          System.out.println("\nNenhum ambiente cadastrado. Crie um ambiente primeiro.");
          return;
      }

      System.out.println("\nTipos de dispositivos disponíveis:");
      System.out.println("1. Lâmpada");
      System.out.println("2. Ar Condicionado");
      System.out.println("3. Aspirador Robô");
      System.out.println("4. Assistente Virtual");
      System.out.println("5. Câmera de Segurança");
      System.out.println("6. Genérico");

      System.out.print("Selecione o tipo de dispositivo: ");
      int tipo = capturarOpcao(1, 6);

      System.out.print("Digite o nome do dispositivo: ");
      String nome = scanner.nextLine();

      System.out.println("\nAmbientes disponíveis:");
      for (int i = 0; i < ambientes.size(); i++) {
          System.out.println((i + 1) + ". " + ambientes.get(i).getNome());
      }

      System.out.print("Selecione o ambiente para o dispositivo: ");
      int indiceAmbiente = capturarOpcao(1, ambientes.size()) - 1;
      String nomeAmbiente = ambientes.get(indiceAmbiente).getNome();

      Dispositivo dispositivo = null;
      switch (tipo) {
          case 1:
              dispositivo = new Lampada(nome, nomeAmbiente);
              break;
          case 2:
              dispositivo = new ArCondicionado(nome, nomeAmbiente);
              break;
          case 3:
              dispositivo = new AspiradorRobo(nome, nomeAmbiente);
              break;
          case 4:
              dispositivo = new AssistenteVirtual(nome, nomeAmbiente);
              break;
          case 5:
              dispositivo = new CameraDeSeguranca(nome, nomeAmbiente);
              break;
          case 6:
              dispositivo = new DispositivoGenerico(nome, nomeAmbiente);
              break;
      }

      ambientes.get(indiceAmbiente).adicionarDispositivo(dispositivo);

      dispositivos.add(dispositivo);
      System.out.println("Dispositivo '" + nome + "' adicionado com sucesso ao ambiente '" + nomeAmbiente + "'!");
  }

  private static void removerDispositivo() {
    if (dispositivos.isEmpty()) {
        System.out.println("\nNenhum dispositivo cadastrado para remover.");
        return;
    }

    System.out.println("\nDispositivos disponíveis para remoção:");
    for (int i = 0; i < dispositivos.size(); i++) {
        System.out.println((i + 1) + ". " + dispositivos.get(i).getNome() + 
                          " (" + dispositivos.get(i).getTipo() + 
                          ") - " + dispositivos.get(i).getAmbiente());
    }

    System.out.print("Digite o número do dispositivo a ser removido: ");
    int indice = capturarOpcao(1, dispositivos.size()) - 1;

    String nomeRemovido = dispositivos.remove(indice).getNome();

    // Remover o dispositivo do ambiente correspondente
    String nomeAmbiente = dispositivos.get(indice).getAmbiente();
    for (Ambiente ambiente : ambientes) {
      if (ambiente.getNome().equals(nomeAmbiente)) {
        ambiente.removerDispositivo(dispositivos.get(indice));
        break;
      }
    }

    System.out.println("Dispositivo '" + nomeRemovido + "' removido com sucesso!");
  }

  private static void listarDispositivos() {
      if (dispositivos.isEmpty()) {
          System.out.println("\nNenhum dispositivo cadastrado.");
          return;
      }

      System.out.println("\nDispositivos cadastrados:");
      for (int i = 0; i < dispositivos.size(); i++) {
          Dispositivo d = dispositivos.get(i);
          System.out.println((i + 1) + ". " + d.getNome() + " (" + d.getTipo() + ") - " + d.getAmbiente() + ": " + d.getEstado());
      }
  }

  private static void mostrarRelatorios() {
      System.out.println("\nRelatórios:");
      System.out.println("1. Listar todos os dispositivos por ambiente");
      System.out.println("2. Voltar");
      System.out.print("Selecione uma opção: ");

      int opcao = capturarOpcao(1, 2);

      switch (opcao) {
          case 1:
              relatorioDispositivosPorAmbiente();
              break;
          case 2:
              return;
      }
  }

  private static void relatorioDispositivosPorAmbiente() {
      if (ambientes.isEmpty()) {
          System.out.println("\nNenhum ambiente cadastrado.");
          return;
      }

      System.out.println("\nDispositivos por ambiente:");
      for (Ambiente ambiente : ambientes) {
          System.out.println("\nAmbiente: " + ambiente.getNome());
          // Listar dispositivos associados a este ambiente
          List<Dispositivo> dispositivosAmbiente = ambiente.getDispositivos();
          if (dispositivosAmbiente.isEmpty()) {
              System.out.println("- Nenhum dispositivo neste ambiente");
              continue;
          }

          for (Dispositivo d : dispositivosAmbiente) {
              System.out.println("- " + d.getNome() + " (" + d.getTipo() + "): " + d.getEstado());
          }
      }
  }

  private static void controlarDispositivos() {
      if (dispositivos.isEmpty()) {
        System.out.println("\nNenhum dispositivo cadastrado para controlar.");
        return;
      }

      System.out.println("\nDispositivos disponíveis para controle:");
      for (int i = 0; i < dispositivos.size(); i++) {
        System.out.println((i + 1) + ". " + dispositivos.get(i).getNome() + 
                            " (" + dispositivos.get(i).getTipo() + ") - " + 
                            dispositivos.get(i).getAmbiente());
      }

      System.out.print("Selecione o dispositivo a ser controlado: ");
      int indice = capturarOpcao(1, dispositivos.size()) - 1;

      Dispositivo dispositivo = dispositivos.get(indice);
      System.out.println("\nControlando dispositivo: " + dispositivo.getNome() + 
                        " (" + dispositivo.getTipo() + ")");
      System.out.println("Estado atual: " + dispositivo.getEstado());

      if (dispositivo instanceof Lampada) {
        controlarLampada((Lampada) dispositivo);
      } else if (dispositivo instanceof ArCondicionado) {
        controlarArCondicionado((ArCondicionado) dispositivo);
      } else if (dispositivo instanceof AspiradorRobo) {
        controlarAspiradorRobo((AspiradorRobo) dispositivo);
      } else if (dispositivo instanceof AssistenteVirtual) {
        controlarAssistenteVirtual((AssistenteVirtual) dispositivo);
      } else if (dispositivo instanceof CameraDeSeguranca) {
        controlarCameraDeSeguranca((CameraDeSeguranca) dispositivo);
      } else if (dispositivo instanceof DispositivoGenerico) {
        controlarDispositivoGenerico(dispositivo);
      } else {
        System.out.println("Tipo de dispositivo não reconhecido.");
      }
  }

  private static void controlarLampada(Lampada lampada) {
      System.out.println("\nOpções para lâmpada:");
      System.out.println("1. Ligar");
      System.out.println("2. Desligar");
      System.out.println("3. Ajustar brilho");
      System.out.println("4. Voltar");

      int opcao = capturarOpcao(1, 4);

      switch (opcao) {
          case 1:
              lampada.ligar();
              System.out.println("Lâmpada ligada.");
              break;
          case 2:
              lampada.desligar();
              System.out.println("Lâmpada desligada.");
              break;
          case 3:
              System.out.print("Digite o nível de brilho (0-100): ");
              int brilho = capturarOpcao(0, 100);
              lampada.ajustarBrilho(brilho);
              System.out.println("Brilho ajustado para " + brilho + "%");
              break;
          case 4:
              return;
      }
  }

  private static void controlarArCondicionado(ArCondicionado ar) {
    System.out.println("\nOpções para ar condicionado:");
    System.out.println("1. Ligar");
    System.out.println("2. Desligar");
    System.out.println("3. Ajustar temperatura");
    System.out.println("4. Voltar");

    int opcao = capturarOpcao(1, 4);

    switch (opcao) {
      case 1:
        ar.ligar();
        System.out.println("Ar condicionado ligado.");
        break;
      case 2:
        ar.desligar();
        System.out.println("Ar condicionado desligado.");
        break;
      case 3:
        System.out.print("Digite a temperatura desejada (16-30°C): ");
        int temperatura = capturarOpcao(16, 30);
        ar.ajustarTemperatura(temperatura);
        System.out.println("Temperatura ajustada para " + temperatura + "°C");
        break;
      case 4:
        return;
    }
  }

  private static void controlarAspiradorRobo(AspiradorRobo aspirador) {
    System.out.println("\nOpções para aspirador robô:");
    System.out.println("1. Ligar");
    System.out.println("2. Desligar");
    System.out.println("3. Configurar tempo de limpeza");
    System.out.println("4. Voltar");

    int opcao = capturarOpcao(1, 4);

    switch (opcao) {
      case 1:
        aspirador.ligar();
        System.out.println("Aspirador robô ligado.");
        break;
      case 2:
        aspirador.desligar();
        System.out.println("Aspirador robô desligado.");
        break;
      case 3:
        System.out.print("Digite o tempo em minutos (10-120): ");
        int tempo = capturarOpcao(10, 120);
        aspirador.configurarTempoLimpeza(tempo);
        System.out.println("Tempo de limpeza ajustado para " + tempo + " minutos.");
        break;
      case 4:
        return;
    }
  }

  private static void controlarAssistenteVirtual(AssistenteVirtual assistente) {
    System.out.println("\nOpções para assistente virtual:");
    System.out.println("1. Ligar");
    System.out.println("2. Desligar");
    System.out.println("3. Tocar Música");
    System.out.println("4. Voltar");

    int opcao = capturarOpcao(1, 4);

    switch (opcao) {
      case 1:
        assistente.ligar();
        System.out.println("Assistente virtual ligada.");
        break;
      case 2:
        assistente.desligar();
        System.out.println("Assistente virtual desligada.");
        break;
      case 3:
        System.out.print("Digite o nome da música: ");
        String musica = scanner.nextLine();
        assistente.tocarMusica(musica);
        System.out.println("Tocando música: " + musica);
        break;
      case 4:
        return;
    }
  }

  private static void controlarCameraDeSeguranca(CameraDeSeguranca camera) {
    System.out.println("\nOpções para Camera de Segurança:");
    System.out.println("1. Ligar");
    System.out.println("2. Desligar");
    System.out.println("3. Gravar na Memória");
    System.out.println("4. Parar Gravação");
    System.out.println("5. Voltar");

    int opcao = capturarOpcao(1, 5);

    switch (opcao) {
      case 1:
        camera.ligar();
        System.out.println("Câmera de segurança ligada.");
        break;
      case 2:
        camera.desligar();
        System.out.println("Câmera de segurança desligada.");
        break;
      case 3:
        camera.iniciarGravacao();
        System.out.println("Câmera de segurança iniciando gravação na memória.");
        break;
      case 4:
        camera.pararGravacao();
        System.out.println("Câmera de segurança parando gravação na memória.");
        break;
      case 5:
        return;
    }
  }

  private static void controlarDispositivoGenerico(Dispositivo dispositivo) {
    System.out.println("\nOpções para dispositivo genérico:");
    System.out.println("1. Ligar");
    System.out.println("2. Desligar");
    System.out.println("3. Voltar");

    int opcao = capturarOpcao(1, 3);

    switch (opcao) {
      case 1:
        dispositivo.ligar();
        System.out.println("Dispositivo genérico ligado.");
        break;
      case 2:
        dispositivo.desligar();
        System.out.println("Dispositivo genérico desligado.");
        break;
      case 3:
        return;
    }
  }

}