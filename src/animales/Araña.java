package animales;

public class Araña {
    private String especie;
    private boolean venenosa;
    private CuerpoAraña cuerpo; // Composición: el cuerpo es parte integral
    private TelaAraña tela; // Agregación: la tela puede existir independientemente

    public Araña(String especie, boolean venenosa) {
        this.especie = especie;
        this.venenosa = venenosa;
        // Composición: Cuerpo dentro del constructor
        this.cuerpo = new CuerpoAraña();
        this.tela = null; // La tela se crea después (agregación)
    }

    public void tejerTela(TelaAraña tela) {
        // Agregación: la tela se pasa desde fuera
        this.tela = tela;
    }

    public String getEspecie() {
        return especie;
    }
}
