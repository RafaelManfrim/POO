package projeto_final;

public abstract class Dispositivo {
    private String nome;
    private String ambiente;
    private Estado estado;

    public Dispositivo(String nome, String ambiente) {
        this.nome = nome;
        this.ambiente = ambiente;
        this.estado = Estado.DESLIGADO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getEstado() {
        return isLigado() ? "Ligado" : "Desligado";
    }

    public boolean isLigado() {
      return this.estado == Estado.LIGADO;
    }

    public void ligar() {
        this.estado = Estado.LIGADO;
    }

    public void desligar() {
        this.estado = Estado.DESLIGADO;
    }

    public abstract String getTipo();
}