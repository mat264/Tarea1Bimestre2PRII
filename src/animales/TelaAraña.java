package animales;

public class TelaAraña {
    private String tipo;
    private double resistencia;

    public TelaAraña(String tipo) {
        this.tipo = tipo;
        this.resistencia = 1.0;
    }

    public String getTipo() {
        return tipo;
    }
}
