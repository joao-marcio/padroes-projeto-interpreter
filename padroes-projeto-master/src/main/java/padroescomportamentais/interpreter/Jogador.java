package padroescomportamentais.interpreter;

public class Jogador {
    private double gol;
    private double assistencia;

    public double getGol() {
        return gol;
    }

    public void setGol(double gol) {
        this.gol = gol;
    }

    public double getAssistencia() {
        return assistencia;
    }

    public void setAssistencia(double assistencia) {
        this.assistencia = assistencia;
    }

    public double calcularNota() {
        return SofaScore.calcularNota(this.gol, this.assistencia
        );
    }
}
