package quimica;

public class Atomo {
    private String simbolo;
    private int numeroAtomico;

    public Atomo(String simbolo, int numeroAtomico) {
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
